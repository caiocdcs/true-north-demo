package com.example.demo.domain;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Car {

  private UUID id;
  private String color;
  private String name;
  private String vin;
}
