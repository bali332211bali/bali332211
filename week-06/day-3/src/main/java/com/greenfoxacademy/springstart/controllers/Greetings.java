package com.greenfoxacademy.springstart.controllers;

public class Greetings {

  long id;
  String content;

  Greetings(long id, String content) {
    this.id = id;
    this.content = content;
  }


  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
