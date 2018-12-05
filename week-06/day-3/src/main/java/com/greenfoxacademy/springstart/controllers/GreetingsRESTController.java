package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsRESTController extends AtomicLong {


  @RequestMapping(value="/greeting")
  public Greetings Greeting(@RequestParam("name") String name) {
    return new Greetings( "greetings " + name);
  }







}
