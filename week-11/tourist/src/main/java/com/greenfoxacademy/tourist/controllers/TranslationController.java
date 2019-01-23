package com.greenfoxacademy.tourist.controllers;

import com.greenfoxacademy.tourist.dtos.TranslationDto;
import com.greenfoxacademy.tourist.models.Translation;
import com.greenfoxacademy.tourist.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class TranslationController {

  private TranslationService translationService;

  @Autowired
  public TranslationController(TranslationService translationService) {
    this.translationService = translationService;
  }

  @GetMapping("/new")
  public String translationNew(@ModelAttribute(value = "translationNew") Translation translationNew) {
    return "translationNew";
  }

  @PostMapping("/new")
  public String translationNewAdd(@ModelAttribute(value = "translationNew") Translation translationNew) {
    translationService.saveTranslation(translationNew);
    return "redirect:/new";
  }


  @GetMapping("/suggest/{id}")
  public String editTranslation(@PathVariable(value = "id") long id,
                                Model model) {
    Translation translationById = translationService.getById(id);
    model.addAttribute("translationEdit", translationById);
    return "editTranslation";
  }

  @PostMapping("/suggest/{id}")
  public String editTranslation(@ModelAttribute(value = "translationEdit") Translation translationEdit,
                               RedirectAttributes redirectAttributes,
                               @PathVariable(value = "id") long id) {
    redirectAttributes.addAttribute("translationId", id);
    translationService.saveTranslation(translationEdit);
    return "redirect:/suggest/{translationId}";
  }

  @GetMapping("/")
  public String translate(@ModelAttribute(value = "translationDto") TranslationDto translationDto) {
    return "main";
  }

  @PostMapping("/")
  public String translate(@ModelAttribute(value = "translationDto") TranslationDto translationDto,
                          Model model) {
    List<Translation> translationsFromDto = translationService.getTranslationsFromDto(translationDto);

    if(translationsFromDto.size() == 0) {
      return "error";
    }

    model.addAttribute("translationsFromDto", translationsFromDto);
    translationService.incrementCountForTranslations(translationsFromDto);

    return "translated";
  }

}
