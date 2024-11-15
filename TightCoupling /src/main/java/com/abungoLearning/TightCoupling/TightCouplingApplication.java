package com.abungoLearning.TightCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightCouplingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TightCouplingApplication.class, args);
		Traveller traveller = new Traveller();
		traveller.startJourney();

	}

}
