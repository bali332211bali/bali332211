package com.greenfoxacademy.numbers.services;

import com.greenfoxacademy.numbers.models.Matrix;

public interface MatrixService {


  int[][] getMatrixFromString(String numbers);

  boolean isMatrixSquareMatrix(String numbers);

  boolean isMatrixIncreasing(String numbers);

  void saveMatrix(Matrix matrix);

  Matrix getById(long id);

}
