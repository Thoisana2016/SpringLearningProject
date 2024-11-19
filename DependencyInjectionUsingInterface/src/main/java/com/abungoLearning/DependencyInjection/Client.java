package com.abungoLearning.DependencyInjection;

public class Client {
    public static void main(String[] args) {
        String msg = "Good Morning MyLady";
        EmailService emailService = new EmailService();
        MessageSender messageSender = new MessageSender(emailService);
        messageSender.sendMessage(msg);

//        msg = "Good Morning My Girl";
        SMSService smsService = new SMSService();
        messageSender = new MessageSender(smsService);
        messageSender.sendMessage(msg);

    }
}
