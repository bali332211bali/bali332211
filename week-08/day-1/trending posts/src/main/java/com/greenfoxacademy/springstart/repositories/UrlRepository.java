package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends CrudRepository<Url, Long> {

    List<Url> findAll();
    Url findByAlias(String alias);

}
