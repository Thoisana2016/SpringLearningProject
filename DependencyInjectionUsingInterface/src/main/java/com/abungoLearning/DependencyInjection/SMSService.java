package com.abungoLearning.DependencyInjection;

public class SMSService implements MessageService{
    @Override
    public void sendMessage(String msg){
        System.out.println("The SMS is : "+msg);
    }
}
