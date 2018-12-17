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
    todoRepository.save(new Todo("dasgfssda"));
    todoRepository.save(new Todo("dasgfgsafrgfssda"));
    todoRepository.save(new Todo("dasgfasfsdfrtegaggsafrgfssda"));


//    Todo todo = new Todo("title");
//    todoService.addTodo(todo);
//    System.exit(0);

  }
}

