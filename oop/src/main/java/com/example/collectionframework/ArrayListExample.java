package com.example.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {

        stringList.add("danidu");
        stringList.add("tharuka");
        stringList.add("dilshan");

        System.out.println(stringList);
    }
}
