package com.greenfoxacademy.anothercsx.services;

import com.greenfoxacademy.anothercsx.models.Xcy;
import com.greenfoxacademy.anothercsx.repositories.XcyRepository;

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
      return xcyRepository.findAllByToppingxcyAndStatusxcy("typeToppingxcyCaseInclusion", variantStatusxcy);
    } else if (typeToppingxcy.equalsIgnoreCase("typeToppingxcyCase2")) {
      return xcyRepository.findAllByStatusxcy(variantStatusxcy);
    }
    return Collections.emptyList();
  }

}
