package com.example.demo.repository;

import com.example.demo.domain.Car;
import jakarta.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {

  private List<Car> CAR_LIST = new LinkedList<>();

  @PostConstruct
  public void init() {
    Car c1 = Car.builder()
        .color("black")
        .vin("1232")
        .id(UUID.randomUUID())
        .name("Toyota")
        .build();

    Car c2 = Car.builder()
        .color("yellow")
        .vin("1536")
        .id(UUID.randomUUID())
        .name("Ferrari")
        .build();

    CAR_LIST.add(c1);
    CAR_LIST.add(c2);
  }

  public Optional<Car> getCarByVin(String vin) {
    return CAR_LIST.stream()
        .filter(car -> car.getVin().equals(vin))
        .findFirst();
  }

  public void deleteCarByVin(String vin) {
    CAR_LIST = CAR_LIST.stream()
        .filter(car -> !car.getVin().equals(vin))
        .toList();
  }

}
