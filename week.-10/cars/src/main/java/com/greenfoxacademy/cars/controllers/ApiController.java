package com.greenfoxacademy.cars.controllers;

import com.greenfoxacademy.cars.dtos.BrandDto;
import com.greenfoxacademy.cars.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  private CarService carService;

  @Autowired
  ApiController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/api/search/{brand}")
  public BrandDto apiBrand(@PathVariable(value = "brand") String brand) {
    return new BrandDto(carService.getCarsByBrand(brand));
  }

}
