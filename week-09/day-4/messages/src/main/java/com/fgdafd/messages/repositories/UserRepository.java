package com.fgdafd.messages.repositories;

import com.fgdafd.messages.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findAll();

}
