package com.greenfoxacademy.cars.dtos;

import com.greenfoxacademy.cars.models.Car;

import java.util.List;

public class BrandDto {

  private String result = "ok";
  private List<Car> data;

  public BrandDto(List<Car> cars) {
    this.data = cars;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Car> getData() {
    return data;
  }

  public void setData(List<Car> data) {
    this.data = data;
  }
}
