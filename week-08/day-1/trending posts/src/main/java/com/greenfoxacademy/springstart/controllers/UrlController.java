package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Url;
import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/posts/url")
public class UrlController {

    private UrlService urlService;

    @Autowired
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("")
    public String url(Model model, @ModelAttribute("urlNew") Url urlNew, HttpSession session) {
        User userCurrent = (User) session.getAttribute("userNew");
        model.addAttribute("userNew", userCurrent.getUsername());
        model.addAttribute("urlNew", urlNew);
        model.addAttribute("urls", urlService.getAllUrlsByUser(userCurrent));

        if (session.getAttribute("nameUrl") != null) {
            urlNew.setUrl(Objects.toString(session.getAttribute("nameUrl")));
            urlNew.setAlias(Objects.toString(session.getAttribute("nameAlias")));
            session.removeAttribute("nameUrl");
            session.removeAttribute("nameAlias");
        }
        return "url";
    }

    @PostMapping("")
    public String url(@ModelAttribute("urlNew") Url urlNew,
                      RedirectAttributes redirectAttributes,
                      HttpSession session) {
        urlNew.setHitCount(0);
        urlService.setSecretCode(urlNew);

        if (urlService.ifUrlAllowed(urlNew)) {
            urlService.setUser(urlNew, (User) session.getAttribute("userNew"));
            urlService.addUrl(urlNew);
            redirectAttributes.addFlashAttribute("takenAlias", "not");
            redirectAttributes.addFlashAttribute("aliasNew", urlNew.getAlias());
            redirectAttributes.addFlashAttribute("secretCodeNew", urlNew.getSecretCode());
            return "redirect:/posts/url";
        }
        redirectAttributes.addFlashAttribute("takenAlias", "taken");
        session.setAttribute("nameUrl", urlNew.getUrl());
        session.setAttribute("nameAlias", urlNew.getAlias());
        return "redirect:/posts/url";
    }

    @GetMapping("/delete")
    public String deleteAll() {
        urlService.deleteAll();
        return "redirect:";
    }

    @GetMapping(value = "/api/links", produces = "application/json")
    @ResponseBody
//    @JsonProperty(value = "secretCode")
//    @JsonIgnoreProperties({"secretCode"})
    public List<Url> links() {
        return urlService.getAllUrls();
    }

    @GetMapping("/a/{alias}")
    public String alias(@PathVariable String alias, RedirectAttributes redirectAttributes) {
        urlService.addHitCount(urlService.findByAlias(alias));
        urlService.addUrl(urlService.findByAlias(alias));
        redirectAttributes.addAttribute("url", urlService.findByAlias(alias).getUrl());
        return "redirect:{url}";
    }

//    @DeleteMapping(value = "/api/links/{id}", produces = "application/json")
//    @ResponseBody
//    @JsonProperty(value = "secretCode")
//    public List<Url> links() {
//        return
//    }

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
