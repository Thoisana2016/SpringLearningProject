package com.abungoLearning.DependencyInjection;

public class MessageSender {
    private EmailService emailService;

    public MessageSender (EmailService emailService){
        this.emailService = emailService;
    }

    public void sendMessage(String msg){
        this.emailService.sendMessage(msg);
    }
}
