package com.greenfoxacademy.tourist.repositories;

import com.greenfoxacademy.tourist.models.Translation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationRepository extends CrudRepository<Translation, Long> {

  List<Translation> findAll();

  Translation findById(long id);

  Translation findByHungarian(String hungarian);

//  @Query(value = "select * from translations order by count desc limit 4", nativeQuery = true)
//  List<Translation> findHighest();

//  @Query(value = "select * from story where title = ?1 limit 1", nativeQuery = true)
//  Story findByTitle(String title);
//
//  @Query(value = "select * from story where title = :title limit 1", nativeQuery = true)
//  Story findByTitle(@Param("title") String title);
//
//  @Query(value = "select s from Story s where s.title = :title")
//  Story findByTitle(@Param("title") String title);
}
