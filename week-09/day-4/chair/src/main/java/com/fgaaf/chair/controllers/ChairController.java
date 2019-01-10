package com.fgaaf.chair.controllers;

import com.fgaaf.chair.models.Chair;
import com.fgaaf.chair.models.User;
import com.fgaaf.chair.services.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/chairs")
public class ChairController {

  private ChairService chairService;

  @Autowired
  public ChairController(ChairService chairService) {
    this.chairService = chairService;
  }

  @GetMapping("")
  public String chairs(HttpSession session,
                     Model model,
                     @ModelAttribute(value = "chairNew") Chair chairNew,
                     @RequestParam(value = "searchString", required = false) String search) {
//                     @RequestParam(value = "page", required = false) Integer pageNumber) {

    if (session.getAttribute("userCurrent") == null) {
      return "redirect:/chairs/register";
    }

    User userCurrent = (User) session.getAttribute("userCurrent");
    model.addAttribute("userCurrentUsername", userCurrent.getUsername());
    model.addAttribute("chairs", chairService.getAllByUserAndNamechairContaining(userCurrent, search));

//        model.addAttribute("chairs", chairService.getAllByUserAndNameContainingOnPage(userCurrent, search, pageNumber));
//        model.addAttribute("pages", chairService.getPagesByUser(userCurrent));

    if (session.getAttribute("chairTaken") != null) {
      Chair chairTaken = (Chair) session.getAttribute("chairTaken");
      chairNew.setNamechairNew(chairTaken.getNamechairNew());
      chairNew.setAmountchairNew(chairTaken.getAmountchairNew());
      session.removeAttribute("chairTaken");
    }
    return "chairs";
  }

  @PostMapping("")
  public String xs(@ModelAttribute("chairNew") Chair chairNew,
                   RedirectAttributes redirectAttributes,
                   HttpSession session) {

    if (!chairService.isChairNamechairAllowed(chairNew.getNamechairNew())) {
      redirectAttributes.addFlashAttribute("chairNamechairTaken", true);
      session.setAttribute("chairTaken", chairNew);
      return "redirect:/chairs";
    }
    chairService.setUser(chairNew, (User) session.getAttribute("userCurrent"));
    chairService.addChair(chairNew);
    redirectAttributes.addFlashAttribute("chairNamechairTaken", false);
    redirectAttributes.addFlashAttribute("chairNewNamechair", chairNew.getNamechairNew());
    redirectAttributes.addFlashAttribute("chairNewAmountchair", chairNew.getAmountchairNew());
    return "redirect:/chairs";
  }

  @GetMapping("/deleteAll")
  public String deleteAll() {
    chairService.deleteAll();
    return "redirect:/chairs";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam(value = "id") long chairId) {
    chairService.deleteById(chairId);
    return "redirect:/chairs";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("chairEdit", chairService.getById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(value = "chairEdit") Chair chairDone, HttpSession session) {
    chairService.setUser(chairDone, (User) session.getAttribute("userCurrent"));
    chairService.addChair(chairDone);
    return "redirect:/chairs";
  }


}
