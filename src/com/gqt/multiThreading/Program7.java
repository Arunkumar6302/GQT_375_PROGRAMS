package com.gqt.multiThreading;

class InterruptThread extends Thread {
    public void run() {
        try {
        	for (int i = 1; i <= 2; i++) {
				System.out.println("Thread Is sleeping");
        	}
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
public class Program7 {
    public static void main(String[] args) {
        InterruptThread t = new InterruptThread();
        t.start();
        t.interrupt();
    }
}

