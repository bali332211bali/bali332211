package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userUrlRepository;

    @Autowired
    public UserService(UserRepository userUrlRepository) {
        this.userUrlRepository = userUrlRepository;
    }

    public void addUserUrl(User userUrl) {
        userUrlRepository.save(userUrl);
    }

    public List<User> getAllUserUrls() {
        return userUrlRepository.findAll();
    }

    public User getUserUrlById(int id) {
        return userUrlRepository.findById(id);
    }

    public void deleteUsers() {
        userUrlRepository.deleteAll();
    }
}
