package com.greenfoxacademy.cars.services;

import com.greenfoxacademy.cars.models.Car;
import com.greenfoxacademy.cars.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

  private CarRepository carRepository;

  public CarServiceImpl(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  @Override
  public List<Car> getCars() {
    return carRepository.findAll();
  }

  @Override
  public List<Car> getCarsBySearch(String search) {
    return carRepository.findAllByPlateContaining(search);

  }

  @Override
  public boolean isPlateSearchValid(String search) {
    return search.matches("[a-zA-Z0-9 -]+") && search.length() <= 7;
  }

  @Override
  public List<Car> getCarsByBrand(String brand) {
    return carRepository.findAllByCarBrand(brand);
  }

  @Override
  public List<Car> getSpecificCars(String sign) {
    List<Car> specificCars = new ArrayList<>();

    for (Car carCurrent : carRepository.findAll()) {
      if (carCurrent.getPlate().startsWith(sign)) {
        specificCars.add(carCurrent);
      }
    }
    return specificCars;
  }

  @Override
  public List<Car> getCarsByParam(String search, String policeOnly, String diplomatsOnly) {

    if (policeOnly != null && policeOnly.equals("1")) {
      return getSpecificCars("RB");
    }
    if (diplomatsOnly != null && diplomatsOnly.equals("1")) {
      return getSpecificCars("DT");
    }
    if (search != null) {
      return getCarsBySearch(search);
    }
    return carRepository.findAll();
  }
}

