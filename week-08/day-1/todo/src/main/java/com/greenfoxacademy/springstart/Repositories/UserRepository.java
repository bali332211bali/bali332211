package com.greenfoxacademy.springstart.Repositories;

import com.greenfoxacademy.springstart.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
