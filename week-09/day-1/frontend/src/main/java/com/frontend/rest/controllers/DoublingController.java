package com.frontend.rest.controllers;

import com.frontend.rest.models.Appenda;
import com.frontend.rest.models.Doubling;
import com.frontend.rest.models.ErrorParam;
import com.frontend.rest.models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

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
    if(name == null && title == null) {
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

  @GetMapping("/appenda/{appendable}")
  public Object appenda(@PathVariable(value = "appendable") String string) {
    return new Appenda(string);
  }

}
