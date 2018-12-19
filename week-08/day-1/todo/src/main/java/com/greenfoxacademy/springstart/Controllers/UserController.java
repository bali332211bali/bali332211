package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.User;
import com.greenfoxacademy.springstart.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/todo")
public class UserController {

  UserService userService;

  @Autowired
  UserController(UserService userService) {
    this.userService = userService;
  }


  @GetMapping("/register")
  public String register(Model model, @ModelAttribute User newUser) {
    model.addAttribute("newUser", newUser);
    return "register";
  }

  @PostMapping("/register")
  public String register(@ModelAttribute User newUser) {
    userService.addUser(newUser);
    return "redirect:/todo/";
  }
}
