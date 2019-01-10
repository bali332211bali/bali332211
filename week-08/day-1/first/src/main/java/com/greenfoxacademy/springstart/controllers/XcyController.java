package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.Xcy;
import com.greenfoxacademy.springstart.services.XcyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/xcys")
public class XcyController {

  private XcyService xcyService;

  @Autowired
  public XcyController(XcyService xcyService) {
    this.xcyService = xcyService;
  }

  @GetMapping("")
  public String xcys(HttpSession session,
                     Model model,
                     @ModelAttribute(value = "xcyNew") Xcy xcyNew,
                     @RequestParam(value = "searchString", required = false) String search) {
//                     @RequestParam(value = "page", required = false) Integer pageNumber) {

    if (session.getAttribute("userCurrent") == null) {
      return "redirect:/xcys/register";
    }

    User userCurrent = (User) session.getAttribute("userCurrent");
    model.addAttribute("userCurrentUsername", userCurrent.getUsername());
    model.addAttribute("xcys", xcyService.getAllByUserAndNamexcyContaining(userCurrent, search));

//        model.addAttribute("xcys", xcyService.getAllByUserAndNameContainingOnPage(userCurrent, search, pageNumber));
//        model.addAttribute("pages", xcyService.getPagesByUser(userCurrent));

    if (session.getAttribute("xcyTaken") != null) {
      Xcy xcyTaken = (Xcy) session.getAttribute("xcyTaken");
      xcyNew.setNamexcy(xcyTaken.getNamexcy());
      xcyNew.setAmountxcy(xcyTaken.getAmountxcy());
      session.removeAttribute("xcyTaken");
    }
    return "xcys";
  }

  @PostMapping("")
  public String xs(@ModelAttribute("xcyNew") Xcy xcyNew,
                   RedirectAttributes redirectAttributes,
                   HttpSession session) {

    if (!xcyService.isXcyNamexcyAllowed(xcyNew.getNamexcy())) {
      redirectAttributes.addFlashAttribute("xcyNamexcyTaken", true);
      session.setAttribute("xcyTaken", xcyNew);
      return "redirect:/xcys";
    }
    xcyService.setUser(xcyNew, (User) session.getAttribute("userCurrent"));
    xcyService.addXcy(xcyNew);
    redirectAttributes.addFlashAttribute("xcyNamexcyTaken", false);
    redirectAttributes.addFlashAttribute("xcyNewNamexcy", xcyNew.getNamexcy());
    redirectAttributes.addFlashAttribute("xcyNewAmountxcy", xcyNew.getAmountxcy());
    return "redirect:/xcys";
  }

  @GetMapping("/deleteAll")
  public String deleteAll() {
    xcyService.deleteAll();
    return "redirect:/xcys";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam(value = "id") long xcyId) {
    xcyService.deleteById(xcyId);
    return "redirect:/xcys";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("xcyEdit", xcyService.getById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(value = "xcyEdit") Xcy xcyDone, HttpSession session) {
    xcyService.setUser(xcyDone, (User) session.getAttribute("userCurrent"));
    xcyService.addXcy(xcyDone);
    return "redirect:/xcys";
  }


}
