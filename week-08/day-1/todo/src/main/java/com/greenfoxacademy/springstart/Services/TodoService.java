package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

  public List<Todo> getActive() {
    List<Todo> todos = (ArrayList) todoRepository.findAll();
    List<Todo> todosActive = new ArrayList<>();

    for (int i = 0; i < todos.size(); i++) {
      if(!todos.get(i).isDone()) {
        todosActive.add(todos.get(i));
      }
    }
    return todosActive;
  }

}
