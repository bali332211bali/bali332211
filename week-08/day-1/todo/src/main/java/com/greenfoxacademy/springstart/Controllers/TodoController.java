package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Models.User;
import com.greenfoxacademy.springstart.Repositories.TodoRepository;
import com.greenfoxacademy.springstart.Services.TodoService;
import com.greenfoxacademy.springstart.Services.UserService;
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
  UserService userService;

  TodoController(TodoRepository todoRepository, TodoService todoService, UserService userService) {
    this.todoRepository = todoRepository;
    this.todoService = todoService;
    this.userService = userService;
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
                     @RequestParam(required = false) String searchString,
                     @ModelAttribute User newUser,
                     @ModelAttribute Todo newTodo) {
    User userLast = userService.getLastUser();

    model.addAttribute("newTodo", newTodo);
    model.addAttribute("newUser", userLast.getUsername());

    List<Todo> todosForUser = new ArrayList<>();
    for (int i = 0; i < todoService.getAllTodos().size(); i++) {
      if (newTodo.getUser() == userLast) {
        todosForUser.add(todoService.getAllTodos().get(i));
        System.out.println(todoService.getAllTodos().get(i).getTitle());
      }
    }

    model.addAttribute("todos", todoRepository.findAllByUserEquals(userLast));




//    if (searchString != null) {
//      model.addAttribute("todos", todoRepository.findAllByTitleContaining(searchString));
//    }
//
//    if (searchString == null && activeSelect != null) {
//      if (activeSelect.equalsIgnoreCase("active")) {
//        model.addAttribute("todos", todoService.getActive());
//      } else if (activeSelect.equalsIgnoreCase("sort by id")) {
//        model.addAttribute("todos", todoService.getSortById());
//      } else {
//        model.addAttribute("todos", todoRepository.findAll());
//      }
//    } else if (searchString == null) {
//      model.addAttribute("todos", todoRepository.findAll());
//    }


    return "todoList";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute Todo newTodo) {
    todoService.addTodo(newTodo);
    newTodo.setUser(userService.getLastUser());
//    userService.getLastUser().getTodos().add(newTodo);
    return "redirect:/todo/list";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String edit(Model model, @PathVariable long id) {
    model.addAttribute("editedTodo", todoService.getTodoById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute Todo editedTodo) {
    todoService.addTodo(editedTodo);
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


//  @GetMapping("/{id}")
//  public String todosId(Model model, @ModelAttribute User newUser, @PathVariable long id) {
//    model.addAttribute("newUser", userService.getUserById(id));
//    System.out.println(newUser.getUsername());
//    System.out.println("todoid");
//    return "redirect:/todo/list";
//  }

}
