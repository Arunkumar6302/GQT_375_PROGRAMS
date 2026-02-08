package com.gqt.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyCallableTask implements Callable<Integer> {
    public Integer call() throws Exception {
        System.out.println("Callable task started");
        Thread.sleep(1000); 
        System.out.println("Callable task finished calculation");
        return 50 + 50;
    }
}
public class Program17 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");
        MyCallableTask task = new MyCallableTask();
        FutureTask<Integer> ft = new FutureTask<>(task);
        System.out.println("FutureTask created");
        Thread t = new Thread(ft);
        System.out.println("Starting child thread");
        t.start();
        System.out.println("Main thread waiting for result...");
        Integer result = ft.get();
        System.out.println("Result received: " + result);
        System.out.println("Main thread finished");
    }
}

