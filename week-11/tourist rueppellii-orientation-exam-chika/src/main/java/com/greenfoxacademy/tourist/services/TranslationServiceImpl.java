package com.greenfoxacademy.tourist.services;

import com.greenfoxacademy.tourist.dtos.TranslationDto;
import com.greenfoxacademy.tourist.models.Translation;
import com.greenfoxacademy.tourist.repositories.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TranslationServiceImpl implements TranslationService {

  private TranslationRepository translationRepository;

  @Autowired
  public TranslationServiceImpl(TranslationRepository translationRepository) {
    this.translationRepository = translationRepository;
  }

  @Override
  public List<Translation> getAll() {
    return translationRepository.findAll();
  }

  @Override
  public Translation getById(long id) {
    return translationRepository.findById(id);
  }

  @Override
  public void saveTranslation(Translation translation) {
    translationRepository.save(translation);
  }

  @Override
  public List<Translation> getTranslationsFromDto(TranslationDto translationDto) {

    List<String> hungarianWords = getHungarianWordsFromDto(translationDto);
    List<Translation> translationsFromDto = new ArrayList<>();

    for (String hungarianWord : hungarianWords) {
      if(translationRepository.findByHungarian(hungarianWord) != null) {
        translationsFromDto.add(translationRepository.findByHungarian(hungarianWord));
      }
    }
    return translationsFromDto;
  }

  @Override
  public void incrementCountForTranslations(List<Translation> translations) {
    for (int i = 0; i < translations.size(); i++) {
      translations.get(i).setCount(translations.get(i).getCount() + 1);
      translationRepository.save(translations.get(i));
    }
  }

  @Override
  public List<Translation> getTranslationsWithHighCounts() {
//    return translationRepository.findHighest();
    List<Translation> translations = translationRepository.findAll();
    List<Translation> translationsWithHighCounts = new ArrayList<>();

    translations.sort(Comparator.comparing(Translation::getCount));

    translationsWithHighCounts.add(translations.get(translations.size() - 1));
    translationsWithHighCounts.add(translations.get(translations.size() - 2));
    translationsWithHighCounts.add(translations.get(translations.size() - 3));
    translationsWithHighCounts.add(translations.get(translations.size() - 4));

    return translationsWithHighCounts;
  }

  private List<String> getHungarianWordsFromDto(TranslationDto translationDto) {
    String hungarian = translationDto.getHungarian();

    String[] splitLines = hungarian.trim().split("\n");
    List<String> hungarianWords = new ArrayList<>();

    for (String splitLine : splitLines) {
      Arrays.stream(splitLine.split(" "))
          .map(String::trim)
          .forEach(hungarianWords::add);
    }
    return hungarianWords;
  }



}
