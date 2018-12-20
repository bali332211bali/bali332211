package com.greenfoxacademy.springstart.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Getter
//@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  String username;
  String password;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "todo_id")
  List<Todo> todos;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
