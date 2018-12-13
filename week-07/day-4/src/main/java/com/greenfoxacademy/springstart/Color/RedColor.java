package com.greenfoxacademy.springstart.Color;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("red");
  }
}
