package com.thoisana.bean.beansDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{

    private Address address;

    public Student(Address address){
        this.address = address;
    }

    public void print(){
        System.out.println(" Student Class Method ...");
    }
}

class Address{

    public void print(){
        System.out.println(" Address Class Method ...");
    }
}

@Configuration
class AppConfig{
    @Bean(name = "addressBean")
    public Address address(){
        return new Address();
    }

    @Bean(name = "studentBean")
    public Student student(){
        return new Student(address());
    }
}


public class BeanAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) applicationContext.getBean("studentBean");
        student.print();
    }
}
