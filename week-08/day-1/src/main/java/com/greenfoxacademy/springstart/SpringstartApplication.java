package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Repositories.Todo;
import com.greenfoxacademy.springstart.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {

  @Autowired
  TodoService todoService;

  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    Todo todo = new Todo("title");
//    todoService.addTodo(todo);
//    System.exit(0);

  }
}

