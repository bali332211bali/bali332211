package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import com.greenfoxacademy.springstart.repositories.XRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XServiceImpl implements XService {

    private XRepository xRepository;

    @Autowired
    public XServiceImpl(XRepository xRepository) {
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

    public void deleteById(long id) {
        xRepository.deleteById(id);
    }

    public X getById(long id) {
        return xRepository.findById(id);
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
//
//        int xsOnPage = 3;
//        int xsOnPageCurrent = xRepository.findAllByUser(user).size() % getPagesByUser(user).size();
//
//        if(xsOnPageCurrent != 0 && pageNumber == getPagesByUser(user).size()) {
//            xsOnPage = xsOnPageCurrent;
//        }
//
//        List<X> xs = new ArrayList<>();
//
//        if (search == null || search.equals("")) {
//            if (xsOnPage > xRepository.findAllByUser(user).size()) {
//                return xRepository.findAllByUser(user);
//            }
//            for (int i = 0; i < xsOnPage; i++) {
//                xs.add(xRepository.findAllByUser(user).get(i + (pageNumber - 1) * xsOnPage));
//            }
//            return xs;
//        }
//        if (xsOnPage > xRepository.findAllByUserAndNameContaining(user, search).size()) {
//            return xRepository.findAllByUserAndNameContaining(user, search);
//        }
//        for (int i = 0; i < xsOnPage; i++) {
//            xs.add(xRepository.findAllByUserAndNameContaining(user, search).get(i + (pageNumber - 1) * xsOnPage));
//        }
//        return xs;
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
