package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class WebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " value");
    return "greeting";
  }

}