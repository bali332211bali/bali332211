package com.greenfoxacademy.numbers.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "matrixes")
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  private int[][] matrix;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int[][] getMatrix() {
    return matrix;
  }

  public void setMatrix(int[][] matrix) {
    this.matrix = matrix;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
