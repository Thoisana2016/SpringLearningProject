package com.abungoLearning.TightCoupling;

public class Traveller {
    Car car = null; //for car
    Bike bike = null; //for bike

    public Traveller(){
        this.car = new Car();
        this.bike = new Bike();
    }
    public void startJourney(){
        this.car.move();
        this.bike.move();
    }
}
