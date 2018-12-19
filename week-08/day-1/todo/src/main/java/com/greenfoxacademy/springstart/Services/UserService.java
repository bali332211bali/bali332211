package com.greenfoxacademy.springstart.Services;


import com.greenfoxacademy.springstart.Models.User;
import com.greenfoxacademy.springstart.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
