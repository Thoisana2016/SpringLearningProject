package com.abungoLearning.Steryotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {
    private Vehicle vehicle;
    @Autowired
    public Traveller(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
