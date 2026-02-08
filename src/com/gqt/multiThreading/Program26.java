package com.gqt.multiThreading;

import java.util.concurrent.locks.*;

class WaitingThread extends Thread {
	static Lock lock;
	static Condition condition;

	WaitingThread(Lock lock, Condition condition) {
		WaitingThread.lock = lock;
		WaitingThread.condition = condition;
	}

	public void run() {
		lock.lock();
		try {
			System.out.println("Thread-1 acquired lock");
			System.out.println("Thread-1 waiting on condition");
			condition.await();
			System.out.println("Thread-1 resumed after signal");
		} catch (Exception e) {
		} finally {
			lock.unlock();
			System.out.println("Thread-1 released lock");
		}
	}
}

class SignalingThread extends Thread {
	static Lock lock;
	static Condition condition;

	SignalingThread(Lock lock, Condition condition) {
		SignalingThread.lock = lock;
		SignalingThread.condition = condition;
	}

	public void run() {
		lock.lock();
		try {
			System.out.println("Thread-2 acquired lock");
			condition.signal();
			System.out.println("Thread-2 sent signal");
		} finally {
			lock.unlock();
			System.out.println("Thread-2 released lock");
		}
	}
}

public class Program26 {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		WaitingThread t1 = new WaitingThread(lock, condition);
		SignalingThread t2 = new SignalingThread(lock, condition);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		t2.start();
	}
}
