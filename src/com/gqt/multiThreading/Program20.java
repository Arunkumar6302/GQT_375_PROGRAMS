package com.gqt.multiThreading;

import java.util.concurrent.CyclicBarrier;

class BarrierAction implements Runnable {
	public void run() {
		System.out.println("Both threads reached the barrier");
	}
}

class MyTaskk implements Runnable {
	CyclicBarrier barrier;

	MyTaskk(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " reached the barrier and waiting");
		try {
			barrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " crossed the barrier");
	}
}

public class Program20 {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		CyclicBarrier barrier = new CyclicBarrier(2, new BarrierAction());
		System.out.println("CyclicBarrier created for 2 threads");
		Thread t1 = new Thread(new MyTaskk(barrier), "Thread-1");
		Thread t2 = new Thread(new MyTaskk(barrier), "Thread-2");
		t1.start();
		t2.start();
	}
}
