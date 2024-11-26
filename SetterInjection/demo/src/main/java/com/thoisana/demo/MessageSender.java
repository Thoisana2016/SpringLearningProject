package com.thoisana.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService mailService;

    @Autowired
    public void setMessageService(@Qualifier("smsService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Setter Injection");
    }

    @Autowired
    public void setMailService(@Qualifier("emailService") MessageService mailService) {
        this.mailService = mailService;
        System.out.println("setter injection 2");
    }

    public void sendMessage(String str){
        this.messageService.sendMessage(str);
        this.mailService.sendMessage(str);
    }
}
