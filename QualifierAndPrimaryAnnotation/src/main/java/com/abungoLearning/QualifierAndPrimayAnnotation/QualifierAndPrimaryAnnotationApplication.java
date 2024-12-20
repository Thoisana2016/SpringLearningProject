package com.abungoLearning.QualifierAndPrimayAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QualifierAndPrimaryAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierAndPrimaryAnnotationApplication.class, args);
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
