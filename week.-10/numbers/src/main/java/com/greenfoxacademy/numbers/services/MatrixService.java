package com.greenfoxacademy.numbers.services;

import com.greenfoxacademy.numbers.models.Matrix;

public interface MatrixService {


  int[][] getMatrixFromString(String numbers);

  boolean isMatrixAllowed(String numbers);

  void saveMatrix(Matrix matrix);

}
