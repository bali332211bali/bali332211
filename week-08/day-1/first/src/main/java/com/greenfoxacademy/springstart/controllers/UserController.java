package com.greenfoxacademy.springstart.controllers;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
@RequestMapping("/xs")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(@ModelAttribute(value = "userNew") User userNew,
                           HttpSession session) {

        if (session.getAttribute("userLast") != null) {
            User userLast = (User) session.getAttribute("userLast");
            userNew.setUsername(userLast.getUsername());
            userNew.setPassword(userLast.getPassword());
            session.removeAttribute("userLast");
        }
        return "register";
    }

    @PostMapping("/register")
    public String url(@ModelAttribute("userNew") User userNew,
                      RedirectAttributes redirectAttributes,
                      HttpSession session) {

        if (!userService.isUsernameAllowed(userNew.getUsername())) {
            redirectAttributes.addFlashAttribute("isUsernameTaken", true);
            session.setAttribute("userLast", userNew.getUsername());
            return "redirect:/xs/register";
        }

        redirectAttributes.addFlashAttribute("isUsernameTaken", false);
        userService.addUser(userNew);
        session.setAttribute("userCurrent", userNew);
        return "redirect:/xs";
    }

    @GetMapping("/deleteUsers")
    public String deleteUsers() {
        userService.deleteAllUsers();
        return "redirect:/xs/register";
    }


}
