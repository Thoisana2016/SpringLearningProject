package com.abungoLearning.Steryotype.DemoRepository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String helloRepository(){
        return "helo from repository";
    }
}
