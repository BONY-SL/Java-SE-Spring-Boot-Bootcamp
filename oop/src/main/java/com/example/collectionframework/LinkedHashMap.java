package com.example.collectionframework;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {

        Map<String,String> stringStringMap = new java.util.LinkedHashMap<>();
        stringStringMap.put("Name","Dilshan Pathirage");
        stringStringMap.put("Address","135/E Badanagodagama ,Beruwala");

        System.out.println(stringStringMap);
    }
}
