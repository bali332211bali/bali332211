package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAll();

}
