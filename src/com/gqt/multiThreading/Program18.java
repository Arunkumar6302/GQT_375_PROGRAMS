package com.gqt.multiThreading;

import java.util.concurrent.*;

public class Program18 {
    public static void main(String[] args) throws Exception {

        System.out.println("Creating BlockingQueue with capacity 3");
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        System.out.println("Adding Elements into the queue : ");
        queue.put(10);
        queue.put(20);
        System.out.println("Queue elements : "+queue);
        
        System.out.println("Taking element from queue...");
        System.out.println("Removed: " + queue.take());

        System.out.println("Removed: " + queue.take());
        System.out.println("Queue elements : "+queue);

    }
}

