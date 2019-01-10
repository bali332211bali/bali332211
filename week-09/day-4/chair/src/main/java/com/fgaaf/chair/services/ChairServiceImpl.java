package com.fgaaf.chair.services;


import com.fgaaf.chair.models.Chair;
import com.fgaaf.chair.models.User;
import com.fgaaf.chair.repositories.ChairRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChairServiceImpl implements ChairService {

  private ChairRepository chairRepository;

  @Autowired
  public ChairServiceImpl(ChairRepository chairRepository) {
    this.chairRepository = chairRepository;
  }

  public void addChair(Chair chair) {
    chairRepository.save(chair);
  }

  public List<Chair> getAllChairs() {
    return chairRepository.findAll();
  }

  public void deleteAll() {
    chairRepository.deleteAll();
  }

  public void deleteById(long id) {
    chairRepository.deleteById(id);
  }

  public Chair getById(long id) {
    return chairRepository.findById(id);
  }

  public void setUser(Chair chair, User user) {
    chair.setUser(user);
  }

  public List<Chair> getAllByUser(User user) {
    return chairRepository.findAllByUser(user);
  }

  public List<Chair> getAllByUserAndNamechairContaining(User user, String search) {
    if (search == null || search.equals("")) {
      return chairRepository.findAllByUser(user);
    }
    return chairRepository.findAllByUserAndNamechairNewContaining(user, search);
  }

  public boolean isChairNamechairAllowed(String name) {
    for (Chair chairCurrent : chairRepository.findAll()) {
      if (chairCurrent.getNamechairNew().equals(name)) {
        return false;
      }
    }
    return true;
  }


//    public List<Chair> getAllByUserAndNameContainingOnPage(User user, String search, Integer pageNumber) {
//
//        int xsOnPage = 3;
//        int xsOnPageCurrent = xRepository.findAllByUser(user).size() % getPagesByUser(user).size();
//
//        if(xsOnPageCurrent != 0 && pageNumber == getPagesByUser(user).size()) {
//            xsOnPage = xsOnPageCurrent;
//        }
//
//        List<Chair> xs = new ArrayList<>();
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
