package com.greenfoxacademy.springstart.Models;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  @Column(name = "nameOfTodo")
  String title;
  boolean isUrgent;
  boolean isDone;

  public Todo() {

  }

  public Todo(String title) {
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