package com.fgaaf.chair.repositories;

import com.fgaaf.chair.models.Chair;
import com.fgaaf.chair.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChairRepository extends CrudRepository<Chair, Long> {

  List<Chair> findAll();

  Chair findById(long id);

  List<Chair> findAllByUser(User user);

  List<Chair> findAllByNamechairNewContaining(String search);

  List<Chair> findAllByUserAndNamechairNewContaining(User user, String search);


}
