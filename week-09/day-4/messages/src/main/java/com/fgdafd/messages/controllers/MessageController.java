package com.fgdafd.messages.controllers;


import com.fgdafd.messages.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/messages")
public class MessageController {


  @GetMapping("")
  public String messages(HttpSession session,
                         Model model) {
    User userCurrent = (User) session.getAttribute("userCurrent");
    model.addAttribute("userCurrentName", userCurrent.getUsername());
    return "messages";
  }

}
