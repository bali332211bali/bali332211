package com.frontend.rest.models;

public class UntilFactor {


  public int result;

  public UntilFactor(int until) {
    int n = 1;
    for (int i = 1; i < until + 1; i++) {
      n *= i;
    }

    this.result = n;
  }

}
