package com.abungoLearning.DependencyInjection;

public class MessageSender {
    //Dependency Injection without Interface
//    private EmailService emailService;
//
//    public MessageSender (EmailService emailService){
//        this.emailService = emailService;
//    }
//
//    public void sendMessage(String msg){
//        this.emailService.sendMessage(msg);
//    }

    //DEPENDENCY WITH interface
    private MessageService messageService;

    public MessageSender(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendMessage(String msg){
        System.out.println("The message is : "+msg);
    }

}
