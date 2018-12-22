package com.greenfoxacademy.springstart.Repositories;

import com.greenfoxacademy.springstart.Models.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends CrudRepository<Url, Long> {


    List<Url> findAll();

}
