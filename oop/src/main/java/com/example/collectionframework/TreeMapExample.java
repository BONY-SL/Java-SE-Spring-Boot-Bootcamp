package com.example.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<Integer,String> stringStringMap = new TreeMap<>();


        stringStringMap.put(1,"Dilshan Pathirage");
        stringStringMap.put(4,"135/E Badanagodagama ,Beruwala");
        stringStringMap.put(2,"Java");
        stringStringMap.put(0,"Spring");

        System.out.println(stringStringMap);


    }
}
