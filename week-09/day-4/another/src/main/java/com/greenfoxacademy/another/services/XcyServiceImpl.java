package com.greenfoxacademy.another.services;

import com.greenfoxacademy.another.models.Xcy;
import com.greenfoxacademy.another.repositories.XcyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class XcyServiceImpl implements XcyService {

  private XcyRepository xcyRepository;

  @Autowired
  public XcyServiceImpl(XcyRepository xcyRepository) {
    this.xcyRepository = xcyRepository;
  }

  @Override
  public void addXcy(Xcy xcy) {
    xcyRepository.save(xcy);
  }

  @Override
  public List<Xcy> getAllXcys() {
    return xcyRepository.findAll();
  }

  @Override
  public Xcy getById(long id) {
    return xcyRepository.findById(id);
  }

  @Override
  public boolean existsById(long id) {
    return xcyRepository.findById(id) != null;
  }

  @Override
  public List<Xcy> getAllWithTypeToppingxcyAndVariantStatusxcyForApi(String typeToppingxcy, String variantStatusxcy) {
    if (typeToppingxcy.equalsIgnoreCase("typeToppingxcyCase")) {
      return xcyRepository.findAllByToppingxcyAndStatusxcy("typeToppingxcyCaseIncludes", variantStatusxcy);
    } else if (typeToppingxcy.equalsIgnoreCase("typeToppingxcyCase2")) {
      return xcyRepository.findAllByStatusxcy(variantStatusxcy);
    }
    return Collections.emptyList();
  }

}
