package com.greenfoxacademy.springstart.Color;

import com.greenfoxacademy.springstart.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

  Printer printer;

  @Autowired
  BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    System.out.println("blue");
    printer.log("dsafdg");
  }

}
