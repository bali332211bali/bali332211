package com.greenfoxacademy.endpoint.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "templates")
public class Template {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  private String name;
  private int amount;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
