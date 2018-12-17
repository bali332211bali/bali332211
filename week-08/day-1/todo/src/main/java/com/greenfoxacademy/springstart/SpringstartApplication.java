package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import com.greenfoxacademy.springstart.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {


  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    todoRepository.save(new Todo("todo", true, false));
//    todoRepository.save(new Todo("todo2", false, true));
//    todoRepository.save(new Todo("todo3", false, false));
  }
}

