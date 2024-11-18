package com.abungoLearning.AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void move(){
        System.out.println("CAR is moving ..");
    }
}
