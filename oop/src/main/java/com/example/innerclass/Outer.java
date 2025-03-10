package com.example.innerclass;

public class Outer {

    private String message = "Hello World!";

    class Inner{

        void display(){

            System.out.println(message);
        }
    }
}
