package com.greenfoxacademy.springstart.Services;


import com.greenfoxacademy.springstart.Models.Todo;
import com.greenfoxacademy.springstart.Models.User;
import com.greenfoxacademy.springstart.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class UserService {


  UserRepository userRepository;

  @Autowired
  UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  public void addUser(User newUser) {
    if(newUser != null) {
      userRepository.save(newUser);
    }
  }

  public User getUserById(long id) {
    return userRepository.findById(id).get();
  }

  public User getLastUser() {
    List<User> users = (List<User>) userRepository.findAll();
    return users.get(users.size()-1);
  }

  public List<User> getAllUsers() {
    List<User> users = (List<User>) userRepository.findAll();
    return users;
  }

  public void addToTodos(Todo todo, User user) {
    user.getTodos().add(todo);
  }

//  public User addUser(User newUser) {
//    if(newUser != null) {
//      return userRepository.save(newUser);
//    }
//    return null;
//  }

}
