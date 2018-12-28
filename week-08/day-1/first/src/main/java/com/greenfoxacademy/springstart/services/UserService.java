package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserService() {}

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean isUsernameAllowed(String username) {
        for (User userCurrent : userRepository.findAll()) {
            if(userCurrent.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

}
