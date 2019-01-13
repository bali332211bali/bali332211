package com.greenfoxacademy.anothercsx.services;

import com.greenfoxacademy.anothercsx.models.Xcy;

import java.util.List;

public interface XcyService {

  void addXcy(Xcy xcy);

  List<Xcy> getAllXcys();

  Xcy getById(long id);

  boolean existsById(long id);

  List<Xcy> getAllWithTypeToppingxcyAndVariantStatusxcyForApi(String typeToppingxcy, String variantStatusxcy);
}
