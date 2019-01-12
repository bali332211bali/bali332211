package com.greenfoxacademy.another.models;

import javax.persistence.*;

@Entity
@Table(name = "Xcys")
public class Xcy {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String namexcy;
  private int amountxcy;
  private String basexcy;
  private String toppingxcy;
  private String statusxcy = "variantStatusxcyFirst";

  public String getNamexcy() {
    return namexcy;
  }

  public int getAmountxcy() {
    return amountxcy;
  }

  public void setNamexcy(String namexcy) {
    this.namexcy = namexcy;
  }

  public void setAmountxcy(int amountxcy) {
    this.amountxcy = amountxcy;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBasexcy() {
    return basexcy;
  }

  public void setBasexcy(String basexcy) {
    this.basexcy = basexcy;
  }

  public String getToppingxcy() {
    return toppingxcy;
  }

  public void setToppingxcy(String toppingxcy) {
    this.toppingxcy = toppingxcy;
  }

  public String getStatusxcy() {
    return statusxcy;
  }

  public void setStatusxcy(String statusxcy) {
    this.statusxcy = statusxcy;
  }
}
