package com.example.item;

public class ItemDemo {
    public static void main(String[] args) {

        Item item = new Item(1001);
        System.out.println(item.getCode());


        Item item1 = new Item(2002);
        item1.setCode(item);

        System.out.println(item.getCode());
    }
}
