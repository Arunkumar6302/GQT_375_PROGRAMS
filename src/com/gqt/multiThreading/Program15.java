package com.gqt.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
	private String taskName;

	MyTask(String taskName) {
		this.taskName = taskName;
	}

	public void run() {
		System.out.println(taskName + " started by thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000); // simulate some work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(taskName + " completed by thread: " + Thread.currentThread().getName());
	}
}

public class Program15 {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		ExecutorService executor = Executors.newFixedThreadPool(2);
		System.out.println("Thread pool with 2 threads created");
		MyTask task1 = new MyTask("Task 1");
		MyTask task2 = new MyTask("Task 2");
		System.out.println("Submitting Task 1");
		executor.execute(task1);
		System.out.println("Submitting Task 2");
		executor.execute(task2);
		executor.shutdown();
		System.out.println("Executor shutdown initiated");
		System.out.println("Main thread finished");
	}
}
