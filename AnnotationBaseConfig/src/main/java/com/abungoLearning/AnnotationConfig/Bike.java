package com.abungoLearning.AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    @Override
    public void move(){
        System.out.println("BIKE is moving ..");
    }
}
