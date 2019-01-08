package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.Xcy;
import com.greenfoxacademy.springstart.services.XcyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/xcys")
public class XcyController {

  private XcyServiceImpl xcyServiceImpl;

  @Autowired
  public XcyController(XcyServiceImpl xcyServiceImpl) {
    this.xcyServiceImpl = xcyServiceImpl;
  }

  @GetMapping("")
  public String xcys(HttpSession session,
                   Model model,
                   @ModelAttribute(value = "xcyNew") Xcy xcyNew,
                   @RequestParam(value = "searchString", required = false) String search) {
//                     @RequestParam(value = "page", required = false) Integer pageNumber) {

    if(session.getAttribute("userCurrent") == null) {
      return "redirect:/xcys/register";
    }

    User userCurrent = (User) session.getAttribute("userCurrent");
    model.addAttribute("userCurrentUsername", userCurrent.getUsername());
    model.addAttribute("xcys", xcyServiceImpl.getAllByUserAndNameContaining(userCurrent, search));

//        model.addAttribute("xcys", xcyServiceImpl.getAllByUserAndNameContainingOnPage(userCurrent, search, pageNumber));
//        model.addAttribute("pages", xcyServiceImpl.getPagesByUser(userCurrent));

    if (session.getAttribute("xcyTaken") != null) {
      Xcy xcyTaken = (Xcy) session.getAttribute("xcyTaken");
      xcyNew.setName(xcyTaken.getName());
      xcyNew.setAmount(xcyTaken.getAmount());
      session.removeAttribute("xcyTaken");
    }
    return "xcys";
  }

  @PostMapping("")
  public String xs(@ModelAttribute("xcyNew") Xcy xcyNew,
                   RedirectAttributes redirectAttributes,
                   HttpSession session) {

    if (!xcyServiceImpl.isXcyNameAllowed(xcyNew.getName())) {
      redirectAttributes.addFlashAttribute("xcyNameTaken", true);
      session.setAttribute("xcyTaken", xcyNew);
      return "redirect:/xcys";
    }
    xcyServiceImpl.setUser(xcyNew, (User) session.getAttribute("userCurrent"));
    xcyServiceImpl.addXcy(xcyNew);
    redirectAttributes.addFlashAttribute("xcyNameTaken", false);
    redirectAttributes.addFlashAttribute("xcyNewName", xcyNew.getName());
    redirectAttributes.addFlashAttribute("xcyNewAmount", xcyNew.getAmount());
    return "redirect:/xcys";
  }

  @GetMapping("/deleteAll")
  public String deleteAll() {
    xcyServiceImpl.deleteAll();
    return "redirect:/xcys";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam(value = "id") long xcyId) {
    xcyServiceImpl.deleteById(xcyId);
    return "redirect:/xcys";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("xcyEdit", xcyServiceImpl.getById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(value = "xcyEdit") Xcy xcyDone, HttpSession session) {
    xcyServiceImpl.setUser(xcyDone, (User) session.getAttribute("userCurrent"));
    xcyServiceImpl.addXcy(xcyDone);
    return "redirect:/xcys";
  }


}
