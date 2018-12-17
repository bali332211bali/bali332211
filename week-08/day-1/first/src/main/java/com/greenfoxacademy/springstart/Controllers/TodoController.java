package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  @GetMapping({"/list" , "/"})
//  @ResponseBody
  public String list(Model model) {

    model.addAttribute("todos", todoRepository.findAll());
    return "todoList";
  }

}
