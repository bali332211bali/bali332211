package com.greenfoxacademy.rate.controllers;

import com.greenfoxacademy.rate.models.Mentor;
import com.greenfoxacademy.rate.security.JwtGenerator;
import com.greenfoxacademy.rate.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MentorController {

  private MentorService mentorService;
  private JwtGenerator jwtGenerator;

  @Autowired
  public MentorController(MentorService mentorService, JwtGenerator jwtGenerator) {
    this.mentorService = mentorService;
    this.jwtGenerator = jwtGenerator;
  }

  @GetMapping("")
  public String mentorNew(Model model,
                          @ModelAttribute(value = "mentorNew") Mentor mentorNew) {
    model.addAttribute("mentors", mentorService.getAll());
    return "newMentor";
  }

  @PostMapping("/mentor")
  public String mentorNew(@ModelAttribute(value = "mentorNew") Mentor mentorNew,
                          RedirectAttributes redirectAttributes) {
    mentorService.saveMentor(mentorNew);
    redirectAttributes.addAttribute("mentorId", mentorNew.getId());
    return "redirect:/mentor/{mentorId}";
  }

  @GetMapping("/mentor/{id}")
  public String mentorById(@PathVariable(value = "id") long id,
                           Model model) {
    if (mentorService.getById(id) == null) {
      return "notFound";
    }
    Mentor mentorById = mentorService.getById(id);
    model.addAttribute("mentorById", mentorById);
    return "mentorById";
  }



}
