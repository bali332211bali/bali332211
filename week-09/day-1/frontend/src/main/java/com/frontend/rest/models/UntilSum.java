package com.frontend.rest.models;

public class UntilSum {

  public int result;

  public UntilSum(int until) {
    int n = 0;
    for (int i = 0; i < until + 1; i++) {
      n += i;
    }

    this.result = n;
  }

}
