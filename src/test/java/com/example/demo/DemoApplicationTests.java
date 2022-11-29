package com.example.demo;

import com.example.demo.controller.CarController;
import com.example.demo.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CarController carController;

	@Test
	void contextLoads() {
	}


	@Test
	void returnCorrectCar() {
		Car car = carController.getCarByVin("1232").getBody();

		Assertions.assertNotNull(car);
		Assertions.assertEquals(car.getVin(), "1232");
	}

	@Test
	void returnNotFoundCode() {
		Assertions.assertEquals(carController.getCarByVin("").getStatusCode(), HttpStatus.NOT_FOUND);
	}

}
