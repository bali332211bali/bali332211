package com.greenfoxacademy.another.repositories;

import com.greenfoxacademy.another.models.Xcy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XcyRepository extends CrudRepository<Xcy, Long> {

  List<Xcy> findAll();

  Xcy findById(long id);

  List<Xcy> findAllByToppingxcyAndStatusxcy(String toppingxcy, String statusxcy);

  List<Xcy> findAllByStatusxcy(String statusxcy);

}
