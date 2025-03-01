package com.example.abstraction;

public interface Animal {

    void sleep();

    // Can implement concrete methods

    default void a(){

    }
    static void  b(){

    }
   
}
