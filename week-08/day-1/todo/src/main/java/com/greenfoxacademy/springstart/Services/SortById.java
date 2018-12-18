package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Todo;

import java.util.Comparator;

class SortById implements Comparator<Todo> {

  @Override
  public int compare(Todo a, Todo b) {
    return (int) a.getId() - (int) b.getId();
  }

}
