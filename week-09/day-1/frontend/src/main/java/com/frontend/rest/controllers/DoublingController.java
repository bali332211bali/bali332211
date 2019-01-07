package com.frontend.rest.controllers;

import com.frontend.rest.models.Doubling;
import com.frontend.rest.models.ErrorParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DoublingController {


  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
//      HashMap<String, String> error = new HashMap<>();
//      error.put("error", "Please provide an input!");
//      return error;
      return new ErrorParam();
    }
    return new Doubling(number);
  }

}
