package com.example.generics;

public class Box <T extends Number>{ // bounded type generics

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
