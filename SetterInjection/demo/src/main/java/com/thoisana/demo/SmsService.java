package com.thoisana.demo;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService{
    @Override
    public void sendMessage(String sms) {
        System.out.println("SMS msg : "+sms);
    }
}