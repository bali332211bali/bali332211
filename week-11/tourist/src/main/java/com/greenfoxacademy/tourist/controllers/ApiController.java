package com.greenfoxacademy.tourist.controllers;

import com.greenfoxacademy.tourist.models.Translation;
import com.greenfoxacademy.tourist.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

  private TranslationService translationService;

  @Autowired
  public ApiController(TranslationService translationService) {
    this.translationService = translationService;
  }

  @GetMapping("/api/frequent")
  public List<Translation> frequent() {
    return translationService.getTranslationsWithHighCounts();
  }

}
