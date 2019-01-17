package com.greenfoxacademy.numbers.services;


import com.greenfoxacademy.numbers.models.Matrix;
import com.greenfoxacademy.numbers.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MatrixServiceImpl implements MatrixService {

  private MatrixRepository matrixRepository;

  @Autowired
  MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public int[][] getMatrixFromString(String numbers) {

    String[] splitNumbers = numbers.split("\n");

    int[][] matrix = new int[splitNumbers.length][splitNumbers.length];
    List<Integer> matrixNumbers = new ArrayList<>();

    for (int i = 0; i < splitNumbers.length; i++) {
      Arrays.stream(splitNumbers[i].split(""))
          .mapToInt(Integer::parseInt)
          .forEach(matrixNumbers::add);

      for (int j = 0; j < matrixNumbers.size(); j++) {
        matrix[i][j] = matrixNumbers.get(j);
      }
      matrixNumbers.clear();
    }
    return matrix;
  }

  @Override
  public boolean isMatrixAllowed(String numbers) {

    String[] splitNumbers = numbers.split("\n");

    for (int i = 0; i < splitNumbers.length; i++) {
      if(splitNumbers[i].length() != splitNumbers.length) {
        return false;
      }
    }
    return true;
  }

  @Override
  public void saveMatrix(Matrix matrix) {
    matrixRepository.save(matrix);
  }

}
