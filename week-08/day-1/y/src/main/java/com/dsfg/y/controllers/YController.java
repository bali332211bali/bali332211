package com.dsfg.y.controllers;

import com.dsfg.y.models.User;
import com.dsfg.y.models.Y;
import com.dsfg.y.services.YService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/ys")
public class YController {

    private YService yService;

    @Autowired
    public YController(YService yService) {
        this.yService = yService;
    }

    @GetMapping("")
    public String ys(HttpSession session,
                     Model model,
                     @ModelAttribute(value = "yNew") Y yNew,
                     @RequestParam(value = "searchString", required = false) String search) {
//                     @RequestParam(value = "page", required = false) Integer pageNumber) {

        User userCurrent = (User) session.getAttribute("userCurrent");
        model.addAttribute("userCurrentUsername", userCurrent.getUsername());
        model.addAttribute("ys", yService.getAllByUserAndNameContaining(userCurrent, search));

//        model.addAttribute("xs", yService.getAllByUserAndNameContainingOnPage(userCurrent, search, pageNumber));
//        model.addAttribute("pages", yService.getPagesByUser(userCurrent));


        if (session.getAttribute("yTaken") != null) {
            Y yTaken = (Y) session.getAttribute("yTaken");
            yNew.setName(yTaken.getName());
            yNew.setAmount(yTaken.getAmount());
            session.removeAttribute("yTaken");
        }
        return "ys";
    }

    @PostMapping("")
    public String ys(@ModelAttribute("yNew") Y yNew,
                     RedirectAttributes redirectAttributes,
                     HttpSession session) {

        if (!yService.isYNameAllowed(yNew.getName())) {
            redirectAttributes.addFlashAttribute("yNameTaken", true);
            session.setAttribute("yTaken", yNew);
            return "redirect:/ys";
        }
        yService.setUser(yNew, (User) session.getAttribute("userCurrent"));
        yService.addY(yNew);
        redirectAttributes.addFlashAttribute("yNameTaken", false);
        redirectAttributes.addFlashAttribute("yNewName", yNew.getName());
        redirectAttributes.addFlashAttribute("yNewAmount", yNew.getAmount());
        return "redirect:/ys";
    }

    @GetMapping("/delete")
    public String deleteAll() {
        yService.deleteAll();
        return "redirect:/ys";
    }


}
