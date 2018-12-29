package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import com.greenfoxacademy.springstart.repositories.XRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Service
public class XService {

    private XRepository xRepository;

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

    public List<X> getAllByUser(User user) {
        return xRepository.findAllByUser(user);
    }

    public List<X> getAllByUserAndNameContaining(User user, String search) {
        if(search == null || search.equals("")) {
            return xRepository.findAllByUser(user);
        }
        return xRepository.findAllByUserAndNameContaining(user, search);
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
