package com.thoisana.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorInjectionApplication.class, args);
		String msg = "Hi Enjoy learning constructor injection";
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConf.class);
		MessageSender messageSender = applicationContext.getBean(MessageSender.class);
		messageSender.sendMessage(msg);
	}

}
