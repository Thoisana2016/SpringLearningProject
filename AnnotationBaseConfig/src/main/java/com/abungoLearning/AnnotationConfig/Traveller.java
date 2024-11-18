package com.abungoLearning.AnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {
    Vehicle vehicle;
    @Autowired
    public Traveller(@Qualifier("bike") Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
