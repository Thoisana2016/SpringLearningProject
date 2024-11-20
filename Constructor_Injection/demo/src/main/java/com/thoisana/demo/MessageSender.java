package com.thoisana.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService smsService;

    public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
    }

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService, MessageService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
    }
    public void sendMessage(String msg){
        this.messageService.sendMessage(msg);
        this.smsService.sendMessage(msg);
    }
}
