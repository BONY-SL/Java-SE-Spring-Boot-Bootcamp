package com.example.collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(3);
        queue.add(5);
        queue.add(10);
        queue.add(7);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

    }
}
