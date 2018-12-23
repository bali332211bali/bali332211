package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.Url;
import com.greenfoxacademy.springstart.Services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/posts/url")
public class UrlController {

    private UrlService urlService;

    @Autowired
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("")
    public String url(Model model, @ModelAttribute("urlNew") Url urlNew) {
        model.addAttribute("urlNew", urlNew);
        model.addAttribute("urls", urlService.getAllUrls());
        return "url";
    }

    @PostMapping("")
    public String url(@ModelAttribute("urlNew") Url urlNew, BindingResult result, RedirectAttributes redirectAttributes) {
        urlNew.setHitCount(0);
        urlService.setSecretCode(urlNew);

        if (urlService.ifUrlAllowed(urlNew)) {
            urlService.addUrl(urlNew);
            redirectAttributes.addFlashAttribute("message", "Success");
            redirectAttributes.addFlashAttribute("alertClass", "alert-success");
            redirectAttributes.addFlashAttribute("aliasNew", urlNew.getAlias());
            redirectAttributes.addFlashAttribute("secretCodeNew", urlNew.getSecretCode());
            return "redirect:/posts/url";
        }
        redirectAttributes.addFlashAttribute("message", "Failed");
        redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        return "redirect:/posts/url";
    }

    @GetMapping("/delete")
    public String deleteAll() {
        urlService.deleteAll();
        return "redirect:";
    }


//    @GetMapping("/suggest-event")
//    public String suggestEvent() {
//        return "/suggested-event/suggestEvent";
//    }
//
//    @PostMapping("/suggest-event")
//    public String receiveSuggestedEvent(BindingResult result, RedirectAttributes redirectAttributes) {
//        redirectAttributes.addFlashAttribute("message", "Failed");
//        redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
//        if (result.hasErrors()) {
//
//        }
//        redirectAttributes.addFlashAttribute("message", "Success");
//        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
//        return "redirect:/suggest-event";
//    }


}
