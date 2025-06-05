package com.example.demoaop.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    public String transferMoney(String from, String to, double amount){

        long startTime =  System.currentTimeMillis();
        try {

            if(amount <= 0){
                throw new IllegalArgumentException("Amount must be positive");
            }
            String result = "Transferred " + amount + " from " + from + " to "+ to;

            System.out.println(result);

            return result;

        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }finally {
            long duration =  System.currentTimeMillis() - startTime;
            System.out.println("Duration : "+duration + " ms");
        }
    }
}
