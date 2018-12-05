package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    Greetings greetings = new Greetings();
    model.addAttribute("name", " value");
    model.addAttribute("load", Greetings.id);
    return "greeting";
  }

}
