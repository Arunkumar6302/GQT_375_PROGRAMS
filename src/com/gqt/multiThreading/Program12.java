package com.gqt.multiThreading;

class Demo {
    synchronized void method1() {
        System.out.println("Thread-1: Entered method1");
        try {
            System.out.println("Thread-1: Waiting...");
            wait(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-1: Resumed after notify");
    }
    synchronized void method2() {
        System.out.println("Thread-2: Entered method2");
        System.out.println("Thread-2: Sending notify");
        notify();
        System.out.println("Thread-2: Notify sent");
    }
}
public class Program12 {
    public static void main(String[] args) {

        Demo d = new Demo();

        Thread t1 = new Thread(() -> d.method1());
        Thread t2 = new Thread(() -> d.method2());

        t1.start();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}

