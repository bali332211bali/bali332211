package com.greenfoxacademy.made.controllers;

import com.greenfoxacademy.made.models.User;
import com.greenfoxacademy.made.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

  private UserService userService;

  @Autowired
  UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/register")
  public String register(@ModelAttribute(value = "userNew") User userNew) {
    return "register";
  }

  @PostMapping("/register")
  public String registerRedirect(@ModelAttribute(value = "userNew") User userNew,
                                 HttpSession session) {
    userService.save(userNew);
    session.setAttribute("userCurrent", userNew);
    return "redirect:/";
  }




}
