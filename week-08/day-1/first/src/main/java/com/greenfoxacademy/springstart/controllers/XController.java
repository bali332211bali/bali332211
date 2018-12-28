package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import com.greenfoxacademy.springstart.services.XService;
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
@RequestMapping("/xs")
public class XController {

    XService xService;

    @Autowired
    public XController(XService xService) {
        this.xService = xService;
    }

    @GetMapping("")
    public String xs(HttpSession session,
                     Model model) {

        User userCurrent = (User) session.getAttribute("userCurrent");
        model.addAttribute("userCurrentUsername", userCurrent.getUsername());
        return "xs";
    }

    @PostMapping("")
    public String xs(@ModelAttribute("urlNew") X xNew,
                     RedirectAttributes redirectAttributes,
                     HttpSession session) {

        if (xService.isXNameAllowed(xNew.getName())) {
            xService.setUser(xNew, (User) session.getAttribute("userCurrent"));
            xService.addX(xNew);
            redirectAttributes.addFlashAttribute("takenAlias", "not");
            redirectAttributes.addFlashAttribute("aliasNew", urlNew.getAlias());
            redirectAttributes.addFlashAttribute("secretCodeNew", urlNew.getSecretCode());
            return "redirect:/posts/url";
        }
        redirectAttributes.addFlashAttribute("takenAlias", "taken");
        session.setAttribute("nameUrl", urlNew.getUrl());
        session.setAttribute("nameAlias", urlNew.getAlias());

        return "xs";
    }


}
