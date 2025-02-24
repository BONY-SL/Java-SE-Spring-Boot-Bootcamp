package com.example;

public class Main {

    public static void main(String[] args) {

        //new MyClass();

        //MyClass.mB();

        //new MyClass.mA();

        //new MyClass().mB();

        //MyClass c1;

        MyClass a1 = new MyClass(100);
        MyClass a2 = new MyClass(101);

        System.out.println(a1.a+""+a2.a);

        a1 = a2;

        a1.a = 0;
        System.out.println(a1.a);
        System.out.println(a2.a);

        a1.mB();

    }
}