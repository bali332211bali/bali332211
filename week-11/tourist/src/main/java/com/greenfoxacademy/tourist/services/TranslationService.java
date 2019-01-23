package com.greenfoxacademy.tourist.services;

import com.greenfoxacademy.tourist.dtos.TranslationDto;
import com.greenfoxacademy.tourist.models.Translation;

import java.util.List;

public interface TranslationService {

  List<Translation> getAll();

  Translation getById(long id);

  void saveTranslation(Translation translation);

  List<Translation> getTranslationsFromDto(TranslationDto translationDto);

  void incrementCountForTranslations(List<Translation> translations);

  List<Translation> getTranslationsWithHighCounts();

}
