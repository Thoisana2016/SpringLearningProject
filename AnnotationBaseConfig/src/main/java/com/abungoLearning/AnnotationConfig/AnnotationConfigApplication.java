package com.abungoLearning.AnnotationConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationConfigApplication.class, args);
//		Vehicle vehicle = new Car();
//		Vehicle vehicle = new Bike();
//		Traveller traveller = new Traveller(vehicle);
//		traveller.startJourney();

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = applicationContext.getBean(Car.class);
		car.move();

		Traveller traveller1 = applicationContext.getBean(Traveller.class);
		traveller1.startJourney();


	}

}
