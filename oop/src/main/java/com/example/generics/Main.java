package com.example.generics;

public class Main {

    public static void main(String[] args) {

        display(60);

        Box b = new Box();
        b.setItem(100);
        System.out.println(b.getItem());

//        Box <String> stringBox = new Box<>();
//        stringBox.setItem("danidu");

//        System.out.println(
//                stringBox.getItem()
//        );

    }

    public static <T extends Number> void display(T value){// generic method

        int a;
        a = 5+value.intValue();
        System.out.println("Hi "+a);
    }
}
