package com.gqt.multiThreading;

class ThreadLocal2 extends Thread {
    static ThreadLocal<String> tl = new ThreadLocal<>();
    ThreadLocal2(String name) {
        super(name);
    }
    public void run() {
        tl.set("Data for " + getName());
        System.out.println(getName() + " -> " + tl.get());
    }
}
public class Program13 {
    public static void main(String[] args) {
    	ThreadLocal2 t1 =  new ThreadLocal2("Thread-A");
    	ThreadLocal2 t2 =  new ThreadLocal2("Thread-B");
    	t1.start();
    	t2.start();
    }
}
