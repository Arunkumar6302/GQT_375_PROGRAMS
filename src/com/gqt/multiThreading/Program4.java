package com.gqt.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	int id;
	Task(int id) {
		this.id = id;
	}
	public void run() {
		System.out.println("Task " + id);
		System.out.println("executed by " + Thread.currentThread().getName());
	}
}
public class Program4 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 5; i++) {
			es.execute(new Task(i));
		}
		es.shutdown();
	}
}
