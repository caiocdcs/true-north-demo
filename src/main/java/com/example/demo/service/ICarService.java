package com.example.demo.service;

import com.example.demo.domain.Car;
import java.util.Optional;

public interface ICarService {
  Optional<Car> getCarByVin(String vin);
}
