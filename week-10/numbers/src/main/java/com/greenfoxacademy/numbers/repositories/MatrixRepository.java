package com.greenfoxacademy.numbers.repositories;

import com.greenfoxacademy.numbers.models.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix, Long> {

  List<Matrix> findAll();

  Matrix findById(long id);


}
