package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.User;
import com.greenfoxacademy.springstart.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/todo")
public class UserController {

  private UserService userService;

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

//  @PostMapping("/{id}/register")
//  public String register(@ModelAttribute User newUser, @PathVariable long id) {
//    userService.addUser(newUser);
////    model.addAttribute("idUser", newUser.getId());
//    System.out.println(newUser.getUsername());
//    System.out.println(newUser.getId());
//    RedirectView rv = new RedirectView();
//    rv.setContextRelative(true);
//    rv.setUrl("/todo/" + id);
//    return rv;
//  }
}
