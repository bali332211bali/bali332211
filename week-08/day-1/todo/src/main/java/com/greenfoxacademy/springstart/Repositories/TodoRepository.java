package com.greenfoxacademy.springstart.Repositories;

import com.greenfoxacademy.springstart.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByTitleContaining(String searchString);

}