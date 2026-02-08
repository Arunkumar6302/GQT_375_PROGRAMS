package com.gqt.multiThreading;

import java.util.concurrent.CountDownLatch;
import java.util.Scanner;

class Worker extends Thread {
    CountDownLatch latch;
    int id;
    Worker(CountDownLatch latch, int id) {
        this.latch = latch;
        this.id = id;
    }
    public void run() {
        System.out.println("Worker " + id + " started");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("Worker " + id + " completed");
        latch.countDown();
    }
}
public class Program9 {
    public static void main(String[] args) throws Exception {
       
        CountDownLatch latch = new CountDownLatch(3);
        Worker w1 = new Worker(latch,101);
        Worker w2 = new Worker(latch,102);
        Worker w3 = new Worker(latch,103);
        w1.start();
        w2.start();
        w3.start();
        latch.await();
        System.out.println("All threads finished execution");
    }
}

