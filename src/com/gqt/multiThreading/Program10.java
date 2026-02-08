package com.gqt.multiThreading;

class PriorityThread2 extends Thread {
    PriorityThread2(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}
public class Program10 {
    public static void main(String[] args) {
        PriorityThread2 t1 = new PriorityThread2("LowPriority : ", Thread.MIN_PRIORITY);
        PriorityThread2 t2 = new PriorityThread2("HighPriority : ", Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}

