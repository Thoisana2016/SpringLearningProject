package com.abungoLearning.DependencyInjection;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String msg){
        System.out.println("The Email is : "+msg);
    }
}
