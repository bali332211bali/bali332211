package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.Xcy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XcyRepository extends CrudRepository<Xcy, Long> {

  List<Xcy> findAll();

  Xcy findById(long id);

  List<Xcy> findAllByUser(User user);

  List<Xcy> findAllByNameContaining(String search);

  List<Xcy> findAllByUserAndNameContaining(User user, String search);


}
