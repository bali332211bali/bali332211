package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.User;
import com.greenfoxacademy.springstart.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class UserController {

  UserService userService;

  @Autowired
  UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/{id}/register")
  public String register(Model model, @ModelAttribute User newUser, @PathVariable long id) {
    model.addAttribute("newUser", userService.getUserById(id));
    return "register";
  }

  @PostMapping("/{id}/register")
  public String register(@ModelAttribute User newUser) {
    userService.addUser(newUser);
    return "redirect:/todo/";
  }
}
