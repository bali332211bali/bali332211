package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import com.greenfoxacademy.springstart.Services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;
  TodoService todoService;

  TodoController(TodoRepository todoRepository, TodoService todoService) {
    this.todoRepository = todoRepository;
    this.todoService = todoService;
  }

//  @GetMapping
//  public String todo(Model model) {
//    model.addAttribute("todos", todoRepository.findAll());
//    model.addAttribute("newTodo", new Todo());
//    return "todoList";
//  }



  @GetMapping({"/list", "/"})
  public String list(Model model,
                     @RequestParam(required = false) String activeSelect,
                     @ModelAttribute Todo newTodo) {
    model.addAttribute("newTodo", newTodo);

    if (activeSelect != null) {
      if (activeSelect.equalsIgnoreCase("active")) {
        model.addAttribute("todos", todoService.getActive());
      } else if (activeSelect.equalsIgnoreCase("sort by id")){
        model.addAttribute("todos", todoService.getSortById());
      } else {
        model.addAttribute("todos", todoRepository.findAll());
      }
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }


    return "todoList";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute Todo newTodo) {
    todoService.addTodo(newTodo);
    return "redirect:/todo/list";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/deleteAll")
  public String deleteAll() {
    todoRepository.deleteAll();
    return "redirect:/todo/list";
  }

//  @GetMapping("/{id}/delete")
//  public String deleteId(@PathVariable long id) {
//    todoService.deleteTodo(id);
//    return "redirect:/todo/list";
//  }

}
