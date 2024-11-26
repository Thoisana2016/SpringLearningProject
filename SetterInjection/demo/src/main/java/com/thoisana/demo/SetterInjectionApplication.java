package com.thoisana.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetterInjectionApplication.class, args);
		String str = "Hello Welcome Back to Spring Tutorial";
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageSender messageSender = applicationContext.getBean(MessageSender.class);
		messageSender.sendMessage(str);
	}

}
