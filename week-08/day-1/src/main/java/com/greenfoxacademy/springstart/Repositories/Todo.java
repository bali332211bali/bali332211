package com.greenfoxacademy.springstart.Repositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  boolean isUrgent;
  boolean isDone;

  Todo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }
}
