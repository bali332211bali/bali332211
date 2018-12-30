package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import com.greenfoxacademy.springstart.services.XService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/xs")
public class XController {

    private XService xService;

    @Autowired
    public XController(XService xService) {
        this.xService = xService;
    }

    @GetMapping("")
    public String xs(HttpSession session,
                     Model model,
                     @ModelAttribute(value = "xNew") X xNew,
                     @RequestParam(value = "searchString", required = false) String search) {
//                     @RequestParam(value = "page", required = false) Integer pageNumber) {

        User userCurrent = (User) session.getAttribute("userCurrent");
        model.addAttribute("userCurrentUsername", userCurrent.getUsername());
        model.addAttribute("xs", xService.getAllByUserAndNameContaining(userCurrent, search));

//        model.addAttribute("xs", xService.getAllByUserAndNameContainingOnPage(userCurrent, search, pageNumber));
//        model.addAttribute("pages", xService.getPagesByUser(userCurrent));


        if (session.getAttribute("xTaken") != null) {
            X xTaken = (X) session.getAttribute("xTaken");
            xNew.setName(xTaken.getName());
            xNew.setAmount(xTaken.getAmount());
            session.removeAttribute("xTaken");
        }
        return "xs";
    }

    @PostMapping("")
    public String xs(@ModelAttribute("xNew") X xNew,
                     RedirectAttributes redirectAttributes,
                     HttpSession session) {

        if (!xService.isXNameAllowed(xNew.getName())) {
            redirectAttributes.addFlashAttribute("xNameTaken", true);
            session.setAttribute("xTaken", xNew);
            return "redirect:/xs";
        }
        xService.setUser(xNew, (User) session.getAttribute("userCurrent"));
        xService.addX(xNew);
        redirectAttributes.addFlashAttribute("xNameTaken", false);
        redirectAttributes.addFlashAttribute("xNewName", xNew.getName());
        redirectAttributes.addFlashAttribute("xNewAmount", xNew.getAmount());
        return "redirect:/xs";
    }

    @GetMapping("/delete")
    public String deleteAll() {
        xService.deleteAll();
        return "redirect:/xs";
    }


}
