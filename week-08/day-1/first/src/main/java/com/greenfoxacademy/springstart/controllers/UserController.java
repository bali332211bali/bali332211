package com.greenfoxacademy.springstart.controllers;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/xs")
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
            return "redirect:/xs/register";
        }
        redirectAttributes.addFlashAttribute("usernameTaken", false);
        userServiceImpl.addUser(userNew);
        session.setAttribute("userCurrent", userNew);
        return "redirect:/xs";
    }

    @GetMapping("/deleteUsers")
    public String deleteUsers() {
        userServiceImpl.deleteAllUsers();
        return "redirect:/xs/register";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(value = "userLogin") User userLogin,
                        HttpSession session,
                        RedirectAttributes redirectAttributes) {
        if (!userServiceImpl.userFound(userLogin)) {
            redirectAttributes.addFlashAttribute("userNotFound", true);
//            redirectAttributes.addFlashAttribute("passwordIncorrect", true);
            return "redirect:/xs/register";
        }
        session.setAttribute("userCurrent", userServiceImpl.getUserByUsername(userLogin.getUsername()));
        return "redirect:/xs";
    }

}
