package com.greenfoxacademy.tourist.models;

import javax.persistence.*;

@Entity
@Table(name = "translations")
public class Translation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String hungarian;
  private String czech;
  private int count = 0;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getHungarian() {
    return hungarian;
  }

  public void setHungarian(String hungarian) {
    this.hungarian = hungarian;
  }

  public String getCzech() {
    return czech;
  }

  public void setCzech(String czech) {
    this.czech = czech;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
