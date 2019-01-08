package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;

import java.util.List;

public interface XService {

  void addX(X x);

  List<X> getAllXs();

  void deleteAll();

  void deleteById(long id);

  X getById(long id);

  void setUser(X x, User user);

  List<X> getAllByUser(User user);

  List<X> getAllByUserAndNameContaining(User user, String search);

  boolean isXNameAllowed(String name);

}
