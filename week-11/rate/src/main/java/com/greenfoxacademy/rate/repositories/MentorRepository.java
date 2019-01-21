package com.greenfoxacademy.rate.repositories;

import com.greenfoxacademy.rate.models.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Long> {

  List<Mentor> findAll();

  Mentor findById(long id);
}
