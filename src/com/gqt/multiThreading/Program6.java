package com.gqt.multiThreading;

class PriorityThread1 extends Thread {
	public void run() {
		System.out.println("Thread Name: " + getName());
		System.out.println("Thread Priority: " + getPriority());
	}
}
public class Program6 {
	public static void main(String[] args) {
		PriorityThread1 t1 = new PriorityThread1();
		PriorityThread1 t2 = new PriorityThread1();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
