package com.example.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class LinkListExample {

    static List<Integer> linkList = new LinkedList<>();

    public static void main(String[] args) {

        linkList.add(10);
        linkList.add(80);
        linkList.add(30);
        linkList.add(40);

        System.out.println(linkList);

    }
}
