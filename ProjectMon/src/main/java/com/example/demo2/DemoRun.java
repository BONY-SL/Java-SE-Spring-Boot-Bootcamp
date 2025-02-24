package com.example.demo2;

public class DemoRun {
    public static void main(String[] args) {

        Car  car = new Car();
        car.regNum = 1;
        car.brand = "Toyota";
        car.model = "prius";

        System.out.println(car.regNum);
        System.out.println(car.brand);
        System.out.println(car.model);

        int s =01;
        int b = 07;

        int d = (s+b);
        System.out.println(d);
    }
}
