package com.gqt.multiThreading;

class VolatileExample extends Thread {
    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        
        while (running) {
        }

        System.out.println("Thread detected running = false");
        System.out.println("Thread stopped");
    }
}
public class Program14{
    public static void main(String[] args) throws Exception {
        VolatileExample t = new VolatileExample();
        t.start();
        Thread.sleep(1000);
        t.running = false;
    }
    
}

