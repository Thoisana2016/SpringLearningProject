package com.abungoLearning.SpringIoCContainer;

public class Traveller {
    Vehicle vehicle;
    public Traveller(Vehicle vehicle){
//        this.vehicle = new Car();
        this.vehicle = new Bike();
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
