package com.abungoLearning.SpringIoCContainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIoCContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoCContainerApplication.class, args);
//		Vehicle vehicle = new Car();
		Vehicle vehicle = new Bike();
		Traveller traveller = new Traveller(vehicle);
		traveller.startJourney();

	}

}
