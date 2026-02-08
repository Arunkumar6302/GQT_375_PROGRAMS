package com.gqt.multiThreading;

import java.util.concurrent.*;

class MyScheduledTask implements Runnable {
	public void run() {
		System.out.println("Task executed after delay");
	}
}

public class Program25 {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		System.out.println("Scheduling task to run after 3 seconds");
		scheduler.schedule(new MyScheduledTask(), 3, TimeUnit.SECONDS);
		scheduler.shutdown();
		System.out.println("Scheduler shutdown initiated");
	}
}
