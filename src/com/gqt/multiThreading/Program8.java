package com.gqt.multiThreading;

import java.util.Scanner;

class Thread11 extends Thread {
    static ThreadLocal<Integer> lv = new ThreadLocal<>();
    private int value;
    Thread11(String name, int value) {
        super(name);
        this.value = value;
    }
    public void run() {
    	lv.set(value);
        System.out.println("--------------------------------");
        System.out.println("Thread Name       : " + Thread.currentThread().getName());
        System.out.println("Thread Local Value: " + lv.get());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Thread " + getName() + " finished execution");
        System.out.println("--------------------------------");
    }
}
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread11 t1 = new Thread11("Thread-ONE", 100);
        Thread11 t2 = new Thread11("Thread-TWO", 200);
        Thread11 t3 = new Thread11("Thread-THREE", 300);
        t1.start();
        t2.start();
        t3.start();

    }
}
