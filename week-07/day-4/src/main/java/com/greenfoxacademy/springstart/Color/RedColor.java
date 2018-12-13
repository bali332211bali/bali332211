package com.greenfoxacademy.springstart.Color;

import com.greenfoxacademy.springstart.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class RedColor implements MyColor {

  @Autowired
  Printer printer;

  RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    System.out.println("red");
    printer.log("dsafdg");
  }
}
