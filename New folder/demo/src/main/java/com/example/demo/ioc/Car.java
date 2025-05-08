package com.example.demo.ioc;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public void start(){
        System.out.println("Car Started....");
    }
}
