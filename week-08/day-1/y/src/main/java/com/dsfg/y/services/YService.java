package com.dsfg.y.services;


import com.dsfg.y.models.User;
import com.dsfg.y.models.Y;
import com.dsfg.y.repositories.YRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YService {

    private YRepository yRepository;

    @Autowired
    public YService(YRepository yRepository) {
        this.yRepository = yRepository;
    }

    public void addY(Y y) {
        yRepository.save(y);
    }

    public List<Y> getAllYs() {
        return yRepository.findAll();
    }

    public void deleteAll() {
        yRepository.deleteAll();
    }

    public void setUser(Y y, User user) {
        y.setUser(user);
    }

    public List<Y> getAllByUser(User user) {
        return yRepository.findAllByUser(user);
    }

    public List<Y> getAllByUserAndNameContaining(User user, String search) {
        if (search == null || search.equals("")) {
            return yRepository.findAllByUser(user);
        }
        return yRepository.findAllByUserAndNameContaining(user, search);
    }

    public boolean isYNameAllowed(String name) {
        for (Y yCurrent : yRepository.findAll()) {
            if (yCurrent.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }


//    public List<Y> getAllByUserAndNameContainingOnPage(User user, String search, Integer pageNumber) {
//
//        int xsOnPage = 3;
//        int xsOnPageCurrent = yRepository.findAllByUser(user).size() % getPagesByUser(user).size();
//
//        if(xsOnPageCurrent != 0 && pageNumber == getPagesByUser(user).size()) {
//            xsOnPage = xsOnPageCurrent;
//        }
//
//        List<Y> xs = new ArrayList<>();
//
//        if (search == null || search.equals("")) {
//            if (xsOnPage > yRepository.findAllByUser(user).size()) {
//                return yRepository.findAllByUser(user);
//            }
//            for (int i = 0; i < xsOnPage; i++) {
//                xs.add(yRepository.findAllByUser(user).get(i + (pageNumber - 1) * xsOnPage));
//            }
//            return xs;
//        }
//        if (xsOnPage > yRepository.findAllByUserAndNameContaining(user, search).size()) {
//            return yRepository.findAllByUserAndNameContaining(user, search);
//        }
//        for (int i = 0; i < xsOnPage; i++) {
//            xs.add(yRepository.findAllByUserAndNameContaining(user, search).get(i + (pageNumber - 1) * xsOnPage));
//        }
//        return xs;
//    }
//
//    public List<Integer> getPagesByUser(User user) {
//        List<Integer> pages = new ArrayList<>();
//        int xsOnPage = 3;
//        int numberOfPages = yRepository.findAllByUser(user).size() / xsOnPage;
//
//        if (yRepository.findAllByUser(user).size() % xsOnPage != 0) {
//            numberOfPages += 1;
//        }
//
//        for (int i = 0; i < numberOfPages; i++) {
//            pages.add(i + 1);
//        }
//        return pages;
//    }


}
