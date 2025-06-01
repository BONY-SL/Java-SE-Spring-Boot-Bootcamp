package com.example.demo.ioc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {


    Car car;


    DemoController(Car car) {
        this.car = car;
    }

    @GetMapping
    public String getName(){
        return car.start();
    }

}
