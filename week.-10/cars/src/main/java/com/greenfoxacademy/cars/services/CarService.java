package com.greenfoxacademy.cars.services;

import com.greenfoxacademy.cars.models.Car;

import java.util.List;

public interface CarService {

  List<Car> getCars();

  List<Car> getCarsBySearch(String search);

  boolean isPlateSearchValid(String search);

  List<Car> getCarsByBrand(String brand);

  List<Car> getSpecificCars(String sign);

  List<Car> getCarsByParam(String search, String policeOnly, String diplomatsOnly);

}
