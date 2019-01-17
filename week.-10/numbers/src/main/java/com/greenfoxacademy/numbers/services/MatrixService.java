package com.greenfoxacademy.numbers.services;

import com.greenfoxacademy.numbers.models.Matrix;

import java.util.List;

public interface MatrixService {

  List<Matrix> getAll();

  int[][] getMatrixFromString(String numbers);

  boolean isMatrixSquareMatrix(String numbers);

  boolean isMatrixIncreasing(String numbers);

  void saveMatrix(Matrix matrix);

  Matrix getById(long id);

}
