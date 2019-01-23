package com.greenfoxacademy.tourist.repositories;

import com.greenfoxacademy.tourist.models.Translation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TranslationRepository extends CrudRepository<Translation, Long> {

  List<Translation> findAll();

  Translation findById(long id);

  Translation findByHungarian(String hungarian);
}
