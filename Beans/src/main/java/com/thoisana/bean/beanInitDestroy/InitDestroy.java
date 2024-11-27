package com.thoisana.bean.beanInitDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    public Student(Address address){
        this.address = address;
        address.print();
    }

    public void print(){
        System.out.println("Printing from Student Class...");
    }

    public void init(){
        System.out.println("Init Logic implement here ...");
    }
    public void destroy(){
        System.out.println("Destroy Logic implement here ...");
    }
}
class Address{

    public void print(){
        System.out.println("Printing from Address Class...");
    }
}

@Configuration
class AppConfig{
    @Bean(name = "addressBean")
    public Address address(){
        return new Address();
    }

    @Bean(name = "studentBean", initMethod = "init", destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }
}
public class InitDestroy {
    public static void main(String[] args) {
        try(  var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)){
            Student student = (Student) applicationContext.getBean("studentBean");
            student.print();
        }
    }
}
