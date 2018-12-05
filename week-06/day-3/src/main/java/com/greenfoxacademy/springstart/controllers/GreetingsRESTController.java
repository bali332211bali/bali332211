package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsRESTController {

  @RequestMapping(value="/greeting")
  public Greetings Greeting(@RequestParam("name") String name) {
    return new Greetings(1, "greetings " + name);
  }


}
