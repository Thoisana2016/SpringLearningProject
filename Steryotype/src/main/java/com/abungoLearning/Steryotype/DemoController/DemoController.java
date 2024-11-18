package com.abungoLearning.Steryotype.DemoController;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    public String helloController(){
        return "hello from controller!..";
    }
}
