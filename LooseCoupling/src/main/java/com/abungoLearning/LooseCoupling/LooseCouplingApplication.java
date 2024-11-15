package com.abungoLearning.LooseCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LooseCouplingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LooseCouplingApplication.class, args);
		Vehicle vehicle = new Car();
		Traveller traveller = new Traveller(vehicle);
		traveller.startJourney();

	}

}
