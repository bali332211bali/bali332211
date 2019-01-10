package com.fgdafd.messages.services;

import com.fgdafd.messages.models.User;
import com.fgdafd.messages.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }

  @Override
  public boolean isUsernameAllowed(String username) {
    for (User userCurrent : userRepository.findAll()) {
      if (userCurrent.getUsername().equals(username)) {
        return false;
      }
    }
    return true;
  }


}
