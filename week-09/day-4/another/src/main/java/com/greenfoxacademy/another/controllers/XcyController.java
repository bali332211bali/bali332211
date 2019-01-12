package com.greenfoxacademy.another.controllers;

import com.greenfoxacademy.another.models.Xcy;
import com.greenfoxacademy.another.services.XcyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class XcyController {

  private XcyService xcyService;

  @Autowired
  public XcyController(XcyService xcyService) {
    this.xcyService = xcyService;
  }

  @GetMapping("/")
  public String xcyNew(@ModelAttribute(value = "xcyNew") Xcy xcyNew) {
    return "xcys";
  }

  @PostMapping("/xcy")
  public String xcyNew(@ModelAttribute("xcyNew") Xcy xcyNew,
                   RedirectAttributes redirectAttributes) {
    xcyService.addXcy(xcyNew);
    redirectAttributes.addAttribute("xcyId", xcyNew.getId());
    return "redirect:/xcys/{xcyId}";
  }

  @GetMapping("/xcy/{xcyId}")
  public String xcyById(@PathVariable(value = "xcyId") long id,
                      Model model) {
    model.addAttribute("xcyById", xcyService.getById(id));
    return "xcyId";
  }

}
