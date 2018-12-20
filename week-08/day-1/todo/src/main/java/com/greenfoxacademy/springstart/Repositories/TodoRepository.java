package com.greenfoxacademy.springstart.Repositories;

import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByTitleContaining(String searchString);
  List<Todo> findAllByUserEquals(Long userId);

  List<Todo> findAllByUserEquals(User user);

}
