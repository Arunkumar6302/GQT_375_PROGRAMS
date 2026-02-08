package com.gqt.multiThreading;

class GroupThread extends Thread {
    GroupThread(ThreadGroup group, String name) {
        super(group, name);
    }
    public void run() {
        System.out.println("Running thread: " + getName());
    }
}
public class Program11 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("MyThreadGroup");
        GroupThread gt1 = new GroupThread(tg,"Thread-1");
        GroupThread gt2 = new GroupThread(tg,"Thread-2");
        gt1.start();
        gt2.start();
        System.out.println("Thread Group Name: " + tg.getName());
    }
}

