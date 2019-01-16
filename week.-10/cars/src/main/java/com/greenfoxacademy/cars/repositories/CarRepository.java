package com.greenfoxacademy.cars.repositories;

import com.greenfoxacademy.cars.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {

  List<Car> findAll();

  List<Car> findAllByPlateContaining(String search);

  List<Car> findAllByCarBrand(String brand);

}
