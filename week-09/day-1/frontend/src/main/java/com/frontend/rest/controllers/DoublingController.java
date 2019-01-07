package com.frontend.rest.controllers;

import com.frontend.rest.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoublingController {


  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
      return new ErrorParam("Please provide an input!");
    }
    return new Doubling(number);
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return new ErrorParam("Please provide a name and a title!");
    } else if (title == null) {
      return new ErrorParam("Please provide a title!");
    } else if (name == null) {
      return new ErrorParam("Please provide a name!");
    }
    return new Greeter(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appenda(@PathVariable(value = "appendable") String string) {
    return new Appenda(string);
  }

  @PostMapping("/dountil/{action}")
  public Object dountil(@PathVariable(value = "action") String action,
                        @RequestBody Until until) {
    if (action.equalsIgnoreCase("sum")) {
      return new UntilSum(until.until);
    }
    return new UntilFactor(until.until);
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody ArraysParam arraysParam) {
    if (arraysParam.what.equalsIgnoreCase("sum")) {
      return new ArraysSum(arraysParam.numbers);
    }
    return new ArraysSum(arraysParam.numbers);
  }

}
