package com.example.securitydemo.controller;

import org.owasp.encoder.Encode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XssController {

    @PostMapping("/submit")
    public String formHandler(@RequestParam String text){
        return "<div>" + Encode.forHtml(text) + "</div>";
    }
}
