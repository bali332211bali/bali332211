package com.greenfoxacademy.anothernew.models;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private int amount;
  private String base;
  private String topping;
  private String status = "ordered";

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amount;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public String getTopping() {
    return topping;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
