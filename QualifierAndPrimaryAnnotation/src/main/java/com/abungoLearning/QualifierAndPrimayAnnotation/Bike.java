package com.abungoLearning.QualifierAndPrimayAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{
    @Override
    public void move(){
        System.out.println("BIKE is moving ..");
    }
}
