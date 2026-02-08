package com.gqt.interface1;

interface MyRunnable {
    void run();
}

interface MyCallable {
    void call();
}

class ThreadClass implements MyRunnable {

    public void run() {
        System.out.println("Thread is running");
    }
}

class TaskClass implements MyCallable {

    public void call() {
        System.out.println("Task is being executed");
    }
}

public class Program31_32 {
    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        TaskClass task = new TaskClass();

        t.run();
        task.call();
    }
}

