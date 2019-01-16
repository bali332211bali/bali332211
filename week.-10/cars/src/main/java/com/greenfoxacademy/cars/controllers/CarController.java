package com.greenfoxacademy.cars.controllers;

import com.greenfoxacademy.cars.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

  private CarService carService;

  @Autowired
  CarController(CarService carService) {
    this.carService = carService;
  }

  @ModelAttribute("searchValid")
  public boolean valid() {
    return true;
  }

  @GetMapping("/")
  public String cars(Model model) {
    model.addAttribute("cars", carService.getCars());
    return "cars";
  }

  @GetMapping("/search")
  public String search(@RequestParam(value = "q", required = false) String search,
                       @RequestParam(value = "police", required = false) String policeOnly,
                       @RequestParam(value = "diplomat", required = false) String diplomatsOnly,
                       Model model) {
    if(search != null && !carService.isPlateSearchValid(search)) {
      model.addAttribute("searchValid", false);
      return "cars";
    }
    model.addAttribute("cars", carService.getCarsByParam(search, policeOnly, diplomatsOnly));
    return "cars";
  }

  @GetMapping("/search/{brand}")
  public String brand(@PathVariable(value = "brand") String brand,
                      Model model) {
    model.addAttribute("cars", carService.getCarsByBrand(brand));
    return "cars";
  }





}
