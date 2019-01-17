package com.greenfoxacademy.numbers.controllers;

import com.greenfoxacademy.numbers.dtos.MatrixStringDto;
import com.greenfoxacademy.numbers.models.Matrix;
import com.greenfoxacademy.numbers.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
public class MatrixController {

  private MatrixService matrixService;

  @Autowired
  MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String matrixNew(@ModelAttribute(value = "matrixStringDtoNew") MatrixStringDto matrixStringDto,
                          @ModelAttribute(value = "matrixNew") Matrix matrixNew) {
    return "matrixNew";
  }

  @PostMapping("/")
  public String matrixNew(@ModelAttribute(value = "matrixStringDtoNew") MatrixStringDto matrixStringDto,
                          @ModelAttribute(value = "matrixNew") Matrix matrixNew,
                          RedirectAttributes redirectAttributes) {

    if (!matrixService.isMatrixSquareMatrix(matrixStringDto.getNumbers())) {
      redirectAttributes.addFlashAttribute("notSquareMatrix", true);
      return "redirect:/";
    }

    if (!matrixService.isMatrixIncreasing(matrixStringDto.getNumbers())) {
      redirectAttributes.addFlashAttribute("notIncreasing", true);
      return "redirect:/";
    }

    matrixNew.setDate(new Date());
    matrixNew.setMatrix(matrixService.getMatrixFromString(matrixStringDto.getNumbers()));
    matrixService.saveMatrix(matrixNew);
    redirectAttributes.addFlashAttribute("notSquareMatrix", false);
    return "redirect:/";
  }

  @GetMapping("/date/{id}/{idAnother}")
  public String date(@PathVariable(value = "id") long id,
                     @PathVariable(value = "idAnother") long idAnother,
                     Model model) {
    if (matrixService.getById(id).getDate().compareTo(matrixService.getById(idAnother).getDate()) > 0) {
      model.addAttribute("first", idAnother);
    } else {
      model.addAttribute("first", id);
    }
    return "date";
  }


}
