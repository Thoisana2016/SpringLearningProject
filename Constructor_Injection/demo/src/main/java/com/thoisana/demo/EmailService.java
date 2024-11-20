package com.thoisana.demo;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Email : "+msg);
    }
}
