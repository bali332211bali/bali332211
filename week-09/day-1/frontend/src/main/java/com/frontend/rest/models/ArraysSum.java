package com.frontend.rest.models;

public class ArraysSum {

  public int result;

  public ArraysSum(int[] numbers) {
    int n = 0;
    for (int i = 0; i < numbers.length; i++) {
      n += numbers[i];
    }
    this.result = n;
  }

}
