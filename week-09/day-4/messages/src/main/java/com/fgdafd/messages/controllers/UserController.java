package com.fgdafd.messages.controllers;

import com.fgdafd.messages.models.User;
import com.fgdafd.messages.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/messages")
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }


  @GetMapping("/register")
  public String register(@ModelAttribute("userNew") User userNew,
                         @ModelAttribute("userLogin") User userLogin,
                         Model model) {


    return "register";
  }

  @PostMapping("/register")
  public String userNew(@ModelAttribute(value = "userNew") User userNew,
                        RedirectAttributes redirectAttributes,
                        HttpSession session) {

    if(!userService.isUsernameAllowed(userNew.getUsername())) {
      redirectAttributes.addFlashAttribute("usernameTaken", true);
      return "redirect:/messages/register";
    }
    redirectAttributes.addFlashAttribute("usernameTaken", false);
    userService.saveUser(userNew);
    session.setAttribute("userCurrent", userNew);
    return "redirect:/messages";
  }




}
