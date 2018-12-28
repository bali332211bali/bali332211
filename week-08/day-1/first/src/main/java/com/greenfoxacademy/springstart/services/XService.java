package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import com.greenfoxacademy.springstart.repositories.XRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XService {

    XRepository xRepository;

    @Autowired
    public XService(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void addX(X x) {
        xRepository.save(x);
    }

    public List<X> getAllXs() {
        return xRepository.findAll();
    }

    public void deleteAll() {
        xRepository.deleteAll();
    }

    public void setUser(X x, User user) {
        x.setUser(user);
    }

    public List<X> getAllXsByUser(User user) {
        return xRepository.findAllByUser(user);
    }

    public List<X> getAllXsByNameContaining(String search) {
        return xRepository.findAllByNameContaining(search);
    }

    public boolean isXNameAllowed(String name) {
        for (X xCurrent : xRepository.findAll()) {
            if(xCurrent.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }



}
