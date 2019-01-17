package com.greenfoxacademy.numbers.controllers;

import com.greenfoxacademy.numbers.models.Matrix;
import com.greenfoxacademy.numbers.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

  private MatrixService matrixService;

  @Autowired
  ApiController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }


  @GetMapping("/matrices")
  public List<Matrix> matrices() {
    return matrixService.getAll();
  }


}
