package com.example.demoaop.controller;

import com.example.demoaop.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transfer")
@RequiredArgsConstructor
public class TransferController {

    private final TransferService transferService;

    @PostMapping
    public String transfer(@RequestParam String from,
                           @RequestParam String to,
                           @RequestParam double amount){

        return transferService.transferMoney(from,to,amount);

    }

}
