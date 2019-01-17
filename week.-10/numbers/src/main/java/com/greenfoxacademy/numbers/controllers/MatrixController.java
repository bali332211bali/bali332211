package com.greenfoxacademy.numbers.controllers;

import com.greenfoxacademy.numbers.dtos.MatrixStringDto;
import com.greenfoxacademy.numbers.models.Matrix;
import com.greenfoxacademy.numbers.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MatrixController {

  private MatrixService matrixService;

  @Autowired
  MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String matrixNew(@ModelAttribute(value = "matrixStringDtoNew") MatrixStringDto matrixStringDto) {
    return "matrixNew";
  }

  @PostMapping("/")
  public String matrixNew(@ModelAttribute(value = "matrixStringDtoNew") MatrixStringDto matrixStringDto,
                          @ModelAttribute(value = "matrixNew") Matrix matrixNew,
                          RedirectAttributes redirectAttributes) {
    if(!matrixService.isMatrixAllowed(matrixStringDto.getNumbers())) {
      redirectAttributes.addFlashAttribute("notAllowed", true);
      return "redirect:/";
    }
    matrixNew.setMatrix(matrixService.getMatrixFromString(matrixStringDto.getNumbers()));
    matrixService.saveMatrix(matrixNew);
    return "redirect:/";
  }





}
