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

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/posts/url")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(@ModelAttribute(value = "userNew") User userNew) {
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute(value = "userNew") User userNew,
                           HttpSession session) {
        userService.addUserUrl(userNew);
        session.setAttribute("userNew", userNew);
        return "redirect:/posts/url";
    }

    @GetMapping("/deleteUsers")
    public String deleteUsers() {
        userService.deleteUsers();
        return "redirect:/posts/url/register";
    }




}
