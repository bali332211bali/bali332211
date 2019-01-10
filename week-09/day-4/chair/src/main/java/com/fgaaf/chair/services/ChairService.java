package com.fgaaf.chair.services;

import com.fgaaf.chair.models.Chair;
import com.fgaaf.chair.models.User;

import java.util.List;

public interface ChairService {

  void addChair(Chair chair);

  List<Chair> getAllChairs();

  void deleteAll();

  void deleteById(long id);

  Chair getById(long id);

  void setUser(Chair chair, User user);

  List<Chair> getAllByUser(User user);

  List<Chair> getAllByUserAndNamechairContaining(User user, String search);

  boolean isChairNamechairAllowed(String name);

}
