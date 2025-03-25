package com.example.collectionframework;

import java.util.Set;

public class LinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> integerSet = new java.util.LinkedHashSet<>();

        integerSet.add(5);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(7);

        System.out.println(integerSet);

    }

}
