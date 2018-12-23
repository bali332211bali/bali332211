package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.Url;
import com.greenfoxacademy.springstart.Services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        System.out.println("get");
        return "url";
    }

    @PostMapping("")
    public String url(@ModelAttribute("urlNew") Url urlNew) {
        System.out.println("post");
        urlNew.setHitCount(0);
        urlService.setSecretCode(urlNew);
        urlService.addUrl(urlNew);

        return "redirect:/posts/url";
    }



}
