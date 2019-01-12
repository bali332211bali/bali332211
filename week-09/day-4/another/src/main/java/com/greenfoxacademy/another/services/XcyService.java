package com.greenfoxacademy.another.services;

import com.greenfoxacademy.another.models.Xcy;

import java.util.List;

public interface XcyService {

  void addXcy(Xcy xcy);

  List<Xcy> getAllXcys();

  Xcy getById(long id);

  boolean existsById(long id);

  List<Xcy> getAllWithTypeToppingxcyAndVariantStatusxcyForApi(String typeToppingxcy, String variantStatusxcy);
}
