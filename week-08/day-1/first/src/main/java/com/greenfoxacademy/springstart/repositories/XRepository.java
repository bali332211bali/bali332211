package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.User;
import com.greenfoxacademy.springstart.models.X;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XRepository extends CrudRepository<X, Long> {

  List<X> findAll();

  X findById(long id);

  List<X> findAllByUser(User user);

  List<X> findAllByNameContaining(String search);

  List<X> findAllByUserAndNameContaining(User user, String search);


}
