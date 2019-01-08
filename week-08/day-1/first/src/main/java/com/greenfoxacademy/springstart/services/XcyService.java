package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.Xcy;

import java.util.List;

public interface XcyService {

  void addXcy(Xcy xcy);

  List<Xcy> getAllXcys();

  void deleteAll();

  void deleteById(long id);

  Xcy getById(long id);

  void setUser(Xcy xcy, User user);

  List<Xcy> getAllByUser(User user);

  List<Xcy> getAllByUserAndNameContaining(User user, String search);

  boolean isXcyNameAllowed(String name);

}
