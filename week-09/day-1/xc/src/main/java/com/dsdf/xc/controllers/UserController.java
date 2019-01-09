package com.dsdf.xc.controllers;


import com.dsdf.xc.models.User;
import com.dsdf.xc.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/messages")
public class UserController {

  private UserServiceImpl userServiceImpl;

  @Autowired
  public UserController(UserServiceImpl userServiceImpl) {
    this.userServiceImpl = userServiceImpl;
  }

  @GetMapping("/register")
  public String register(@ModelAttribute(value = "userNew") User userNew,
                         @ModelAttribute(value = "userLogin") User userLogin,
                         HttpSession session) {

    if (session.getAttribute("userTaken") != null) {
      User userTaken = (User) session.getAttribute("userTaken");
      userNew.setUsername(userTaken.getUsername());
      userNew.setPassword(userTaken.getPassword());
      session.removeAttribute("userTaken");
    }
    return "register";
  }

  @PostMapping("/register")
  public String url(@ModelAttribute("userNew") User userNew,
                    RedirectAttributes redirectAttributes,
                    HttpSession session) {

    if (!userServiceImpl.isUsernameAllowed(userNew.getUsername())) {
      redirectAttributes.addFlashAttribute("usernameTaken", true);
      session.setAttribute("userTaken", userNew);
      return "redirect:/messages/register";
    }
    redirectAttributes.addFlashAttribute("usernameTaken", false);
    userServiceImpl.addUser(userNew);
    session.setAttribute("userCurrent", userNew);
    return "redirect:/messages";
  }

  @GetMapping("/deleteUsers")
  public String deleteUsers() {
    userServiceImpl.deleteAllUsers();
    return "redirect:/messages/register";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "userLogin") User userLogin,
                      HttpSession session,
                      RedirectAttributes redirectAttributes) {
    if (!userServiceImpl.userFound(userLogin)) {
      redirectAttributes.addFlashAttribute("userNotFound", true);
//            redirectAttributes.addFlashAttribute("passwordIncorrect", true);
      return "redirect:/messages/register";
    }
    session.setAttribute("userCurrent", userServiceImpl.getUserByUsername(userLogin.getUsername()));
    return "redirect:/messages";
  }

  @GetMapping("/{id}/editUser")
  public String edit(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("userEdit", userServiceImpl.getUserById(id));
    return "editUser";
  }

  @PostMapping("/{id}/editUser")
  public String edit(@ModelAttribute(value = "userEdit") User userDone, HttpSession session) {
    userServiceImpl.addUser(userDone);
    session.removeAttribute("userCurrent");
    session.setAttribute("userCurrent", userDone);
    return "redirect:/messages";
  }

}
