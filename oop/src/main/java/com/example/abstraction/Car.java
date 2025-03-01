package com.example.abstraction;

public class Car extends Vehical{

    @Override
    void start() {
        System.out.println("Car is Start...");
    }

    @Override
    void stop() {
        System.out.println("Car is Stop...");
    }
}
