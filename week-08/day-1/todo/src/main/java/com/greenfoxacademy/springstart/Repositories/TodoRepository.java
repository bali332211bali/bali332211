package com.greenfoxacademy.springstart.Repositories;

import com.greenfoxacademy.springstart.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {


}
