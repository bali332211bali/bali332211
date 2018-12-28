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
                     Model model,
                     @ModelAttribute(value = "xNew") X xNew) {

        User userCurrent = (User) session.getAttribute("userCurrent");
        model.addAttribute("userCurrentUsername", userCurrent.getUsername());
        model.addAttribute("xs", xService.getAllXsByUser(userCurrent));

        if (session.getAttribute("xLast") != null) {
            X xLast = (X) session.getAttribute("xLast");
            xNew.setName(xLast.getName());
            xNew.setAmount(xLast.getAmount());
            session.removeAttribute("xLast");
        }
        return "xs";
    }

    @PostMapping("")
    public String xs(@ModelAttribute("urlNew") X xNew,
                     RedirectAttributes redirectAttributes,
                     HttpSession session) {

        if (!xService.isXNameAllowed(xNew.getName())) {
            redirectAttributes.addFlashAttribute("isXNameTaken", true);
            session.setAttribute("xLast", xNew);
            return "redirect:/xs";
        }
        xService.setUser(xNew, (User) session.getAttribute("userCurrent"));
        xService.addX(xNew);
        redirectAttributes.addFlashAttribute("isXNameTaken", false);
        redirectAttributes.addFlashAttribute("nameXNew", xNew.getName());
        redirectAttributes.addFlashAttribute("amountXNew", xNew.getAmount());
        return "redirect:/xs";
    }

    @GetMapping("/delete")
    public String deleteAll() {
        xService.deleteAll();
        return "redirect:";
    }


}
