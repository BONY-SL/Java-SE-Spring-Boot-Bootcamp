package com.example.innerclass;

public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();


        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Dog bark...");
            } // anonymous Inner Class
        };

        animal.makeSound();
    }
}
