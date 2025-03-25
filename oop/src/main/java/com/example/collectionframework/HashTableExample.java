package com.example.collectionframework;


import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {

        Map<String,String> map = new Hashtable<>();

        map.put("Name","Dilshan Pathirage");
        map.put("Address","135/E Badanagodagama ,Beruwala");

        System.out.println(map);
    }
}
