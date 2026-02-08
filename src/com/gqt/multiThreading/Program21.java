package com.gqt.multiThreading;

import java.util.concurrent.Semaphore;

class SemaphoreTask extends Thread {
	Semaphore sem;

	SemaphoreTask(Semaphore sem, String name) {
		super(name);
		this.sem = sem;
	}

	public void run() {
		try {
			System.out.println(getName() + " trying to acquire permit");
			sem.acquire();
			System.out.println(getName() + " entered critical section");
			Thread.sleep(1000);
			System.out.println(getName() + " leaving critical section");
			sem.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Program21 {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		Semaphore sem = new Semaphore(1);
		System.out.println("Semaphore created ");
		SemaphoreTask sm = new SemaphoreTask(sem, "Thread-1");
		SemaphoreTask sm1 = new SemaphoreTask(sem, "Thread-2");
		sm.start();
		sm1.start();
	}
}
