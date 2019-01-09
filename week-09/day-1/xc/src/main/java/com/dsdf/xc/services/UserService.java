package com.dsdf.xc.services;

import com.dsdf.xc.models.User;

import java.util.List;

public interface UserService {

  void addUser(User user);

  List<User> getAllUser();

  User getUserById(long id);

  void deleteAllUsers();

  User getUserByUsername(String username);

  boolean isUsernameAllowed(String username);

  boolean userFound(User user);

}
