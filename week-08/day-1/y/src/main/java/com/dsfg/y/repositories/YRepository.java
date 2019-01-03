package com.dsfg.y.repositories;

import com.dsfg.y.models.User;
import com.dsfg.y.models.Y;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YRepository extends CrudRepository<Y, Long> {

    List<Y> findAll();
    List<Y> findAllByUser(User user);
    List<Y> findAllByNameContaining(String search);
    List<Y> findAllByUserAndNameContaining(User user, String search);



}
