package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.service.impl.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/v1/")
public class CarController {

  private final CarService carService;

  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/car/{vin}")
  public ResponseEntity<Car> getCarByVin(@PathVariable String vin) {
    return ResponseEntity.of(carService.getCarByVin(vin));
  }
}
