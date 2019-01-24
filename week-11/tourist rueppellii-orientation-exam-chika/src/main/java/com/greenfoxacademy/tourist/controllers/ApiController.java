package com.greenfoxacademy.tourist.controllers;

import com.greenfoxacademy.tourist.dtos.TranslationDto;
import com.greenfoxacademy.tourist.models.Translation;
import com.greenfoxacademy.tourist.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PostMapping("/api/newTranslation")
  public ResponseEntity<String> newTranslation(@RequestBody Translation translation) {
    if(translation.getHungarian() != null && translation.getCzech() != null) {
      translationService.saveTranslation(translation);
      return new ResponseEntity<>("Saved translation", HttpStatus.OK);
    }
    return new ResponseEntity<>("Add hungarian and czech fields" , HttpStatus.BAD_REQUEST);
  }

}
