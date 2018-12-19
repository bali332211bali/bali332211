package com.greenfoxacademy.springstart.Models;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "nameOfTodo")
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {

  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.urgent = isUrgent;
    this.done = isDone;
  }



  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}