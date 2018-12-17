package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  TodoRepository todoRepository;

  @Autowired
  TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void addTodo(Todo todo) {
    if(todo != null) {
      this.todoRepository.save(todo);
    }

  }


}
