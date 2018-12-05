package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greetings {

  static AtomicLong atomicLong = new AtomicLong(1);
  static long id;
  String content;

  Greetings() {
    id = atomicLong.getAndIncrement();
  }

  Greetings(String content) {
    id = atomicLong.getAndIncrement();
    this.content = content;
  }


  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
