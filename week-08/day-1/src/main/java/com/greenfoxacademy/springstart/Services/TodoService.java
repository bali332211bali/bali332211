package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Repositories.Todo;
import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  @Autowired
  TodoRepository todoRepository;

  TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void addTodo(Todo todo) {
    this.todoRepository.save(todo);
  }


}
