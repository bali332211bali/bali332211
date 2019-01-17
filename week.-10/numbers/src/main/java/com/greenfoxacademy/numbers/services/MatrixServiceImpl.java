package com.greenfoxacademy.numbers.services;


import com.greenfoxacademy.numbers.models.Matrix;
import com.greenfoxacademy.numbers.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MatrixServiceImpl implements MatrixService {

  private MatrixRepository matrixRepository;

  @Autowired
  MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public List<Matrix> getAll() {
    return matrixRepository.findAll();
  }

  @Override
  public int[][] getMatrixFromString(String numbers) {

    String[] splitNumbers = numbers.split("\n");

    List<Integer> matrixNumbers = new ArrayList<>();
    int[][] matrix = new int[splitNumbers.length][splitNumbers.length];

      for (int i = 0; i < splitNumbers.length; i++) {
      Arrays.stream(splitNumbers[i].trim().split(" "))
          .map(String::trim)
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
  public boolean isMatrixSquareMatrix(String numbers) {
    String[] splitNumbers = numbers.trim().split("\n");

    for (int i = 0; i < splitNumbers.length; i++) {
      if(splitNumbers.length != getCountOfCharInString(' ', splitNumbers[i]) + 1) {
        return false;
      }
    }
    return true;
  }

  private int getCountOfCharInString(char c, String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if(string.charAt(i) == c) {
        count++;
      }
    }
    return count;
  }

  @Override
  public boolean isMatrixIncreasing(String numbers) {

    String[] splitNumbers = numbers.trim().split("\n");
    List<Integer> matrixNumbers = new ArrayList<>();

    for (int i = 0; i < splitNumbers.length; i++) {
      Arrays.stream(splitNumbers[i].split(" "))
          .map(String::trim)
          .mapToInt(Integer::parseInt)
          .forEach(matrixNumbers::add);

      if(!matrixNumbers.equals(matrixNumbers.stream().sorted(Integer::compareTo).collect(Collectors.toList()))) {
        return false;
      }
      matrixNumbers.clear();
    }
    return true;
  }


  @Override
  public void saveMatrix(Matrix matrix) {
    matrixRepository.save(matrix);
  }

  @Override
  public Matrix getById(long id) {
    return matrixRepository.findById(id);
  }

}
