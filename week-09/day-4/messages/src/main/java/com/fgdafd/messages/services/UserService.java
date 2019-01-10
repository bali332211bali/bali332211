package com.fgdafd.messages.services;


import com.fgdafd.messages.models.User;

public interface UserService {

  void saveUser(User user);

  boolean isUsernameAllowed(String username);

}
