package com.fgaaf.chair.models;

import javax.persistence.*;

@Entity
@Table(name = "Chairs")
public class Chair {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String namechairNew;
  private int amountchairNew;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;

  public String getNamechairNew() {
    return namechairNew;
  }

  public int getAmountchairNew() {
    return amountchairNew;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public void setNamechairNew(String namechairNew) {
    this.namechairNew = namechairNew;
  }

  public void setAmountchairNew(int amountchairNew) {
    this.amountchairNew = amountchairNew;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }
}
