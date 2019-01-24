package com.greenfoxacademy.rate.services;


import com.greenfoxacademy.rate.models.Mentor;

import java.util.List;

public interface MentorService {

  List<Mentor> getAll();

  Mentor getById(long id);

  void saveMentor(Mentor mentor);

  void deleteMentor(Mentor mentor);
}
