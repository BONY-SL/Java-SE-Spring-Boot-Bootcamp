package com.example.demo.ioc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class DemoController {

    private final Car car;

    @GetMapping("/hello")
    public String getHello(){
        car.start();
        return "Hello";
    }

}
