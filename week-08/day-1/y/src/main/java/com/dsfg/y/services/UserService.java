package com.dsfg.y.services;


import com.dsfg.y.models.User;
import com.dsfg.y.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService() {}

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

    public boolean userFound(User user) {
        if(userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
            return true;
        }
        return false;
    }

}
