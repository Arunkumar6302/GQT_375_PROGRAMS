package com.gqt.multiThreading;

class InterruptTask extends Thread {

    public void run() {
        System.out.println("Thread started and going to sleep...");

        try {
            Thread.sleep(5000);
            System.out.println("Thread woke up normally");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while sleeping");
        }
        System.out.println("Thread execution finished");
    }
}
public class Program16 {
    public static void main(String[] args) {

        System.out.println("Main thread started");
        InterruptTask t = new InterruptTask();
        t.start();
        System.out.println("Main thread interrupting ");
        t.interrupt();
        System.out.println("Main thread finished");
        System.out.println("-------------------------------");
    }
}
