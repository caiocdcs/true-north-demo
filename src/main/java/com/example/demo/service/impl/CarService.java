package com.example.demo.service.impl;

import com.example.demo.domain.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.ICarService;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CarService implements ICarService {

  private final CarRepository carRepository;

  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  @Override
  public Optional<Car> getCarByVin(String vin) {
    if (vin == null) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }

    return carRepository.getCarByVin(vin);
  }
}
