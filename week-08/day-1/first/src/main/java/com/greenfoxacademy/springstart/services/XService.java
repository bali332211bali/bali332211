package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import com.greenfoxacademy.springstart.repositories.XRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Collections;
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
        if (search == null || search.equals("")) {
            return xRepository.findAllByUser(user);
        }
        return xRepository.findAllByUserAndNameContaining(user, search);
    }

    public boolean isXNameAllowed(String name) {
        for (X xCurrent : xRepository.findAll()) {
            if (xCurrent.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

//    public List<X> getAllByUserAndNameContainingOnPage(User user, String search, Integer pageNumber) {
//        int xsOnPage = 3;
//        List<X> xs = new ArrayList<>();
//        int xsOnPageCurrent = xsOnPage;
//
//        if (xRepository.findAllByUser(user).size() == 0) {
//            return Collections.emptyList();
//        }
//
//        if (xsOnPage > xRepository.findAllByUser(user).size()) {
//            xsOnPageCurrent = xRepository.findAllByUser(user).size() % xsOnPage;
//        }
//
//        if (pageNumber != null) {
//            if (pageNumber * xsOnPage > xRepository.findAllByUser(user).size()) {
//                xsOnPageCurrent = xRepository.findAllByUser(user).size() % xsOnPage;
//            }
//
//            if (search == null || search.equals("")) {
//                for (int i = 0; i < xsOnPageCurrent; i++) {
//                    xs.add(xRepository.findAllByUser(user).get(xsOnPage * (pageNumber - 1) + i));
//                }
//                return xs;
//            }
//        }
//
//        for (int i = 0; i < xsOnPageCurrent; i++) {
//            xs.add(xRepository.findAllByUser(user).get(i));
//        }
//        return xs;
//
//
////        return xRepository.findAllByUserAndNameContaining(user, search);
//    }
//
//    public List<Integer> getPagesByUser(User user) {
//        List<Integer> pages = new ArrayList<>();
//        int xsOnPage = 3;
//        int numberOfPages = xRepository.findAllByUser(user).size() / xsOnPage;
//
//        if (xRepository.findAllByUser(user).size() % xsOnPage != 0) {
//            numberOfPages += 1;
//        }
//
//        for (int i = 0; i < numberOfPages; i++) {
//            pages.add(i + 1);
//        }
//        return pages;
//    }


}
