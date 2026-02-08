package com.gqt.multiThreading;

class MyThread1 extends Thread {
	public MyThread1(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Thread Name: " + getName());
	}
}
public class Program1 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("Thread-A");
		MyThread1 t2 = new MyThread1("Thread-B");
		MyThread1 t3 = new MyThread1("Thread-C");
		t1.start();
		t2.start();
		t3.start();
	}
}
