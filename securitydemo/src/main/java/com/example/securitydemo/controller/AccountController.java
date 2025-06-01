package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/change-password")
    public String changePassword(@RequestParam String password){
        return "password changed:" + password;
    }
}
