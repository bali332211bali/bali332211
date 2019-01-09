package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.Xcy;
import com.greenfoxacademy.springstart.repositories.XcyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XcyServiceImpl implements XcyService {

  private XcyRepository xcyRepository;

  @Autowired
  public XcyServiceImpl(XcyRepository xcyRepository) {
    this.xcyRepository = xcyRepository;
  }

  public void addXcy(Xcy xcy) {
    xcyRepository.save(xcy);
  }

  public List<Xcy> getAllXcys() {
    return xcyRepository.findAll();
  }

  public void deleteAll() {
    xcyRepository.deleteAll();
  }

  public void deleteById(long id) {
    xcyRepository.deleteById(id);
  }

  public Xcy getById(long id) {
    return xcyRepository.findById(id);
  }

  public void setUser(Xcy xcy, User user) {
    xcy.setUser(user);
  }

  public List<Xcy> getAllByUser(User user) {
    return xcyRepository.findAllByUser(user);
  }

  public List<Xcy> getAllByUserAndNamexcyContaining(User user, String search) {
    if (search == null || search.equals("")) {
      return xcyRepository.findAllByUser(user);
    }
    return xcyRepository.findAllByUserAndNamexcyContaining(user, search);
  }

  public boolean isXcyNamexcyAllowed(String name) {
    for (Xcy xcyCurrent : xcyRepository.findAll()) {
      if (xcyCurrent.getNamexcy().equals(name)) {
        return false;
      }
    }
    return true;
  }


//    public List<Xcy> getAllByUserAndNameContainingOnPage(User user, String search, Integer pageNumber) {
//
//        int xsOnPage = 3;
//        int xsOnPageCurrent = xRepository.findAllByUser(user).size() % getPagesByUser(user).size();
//
//        if(xsOnPageCurrent != 0 && pageNumber == getPagesByUser(user).size()) {
//            xsOnPage = xsOnPageCurrent;
//        }
//
//        List<Xcy> xs = new ArrayList<>();
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
