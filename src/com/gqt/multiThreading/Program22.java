package com.gqt.multiThreading;

import java.util.concurrent.Exchanger;

class MyThread12 extends Thread {
	Exchanger<String> exchanger;

	MyThread12(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	public void run() {
		try {
			String msg = "Hello";
			System.out.println("Thread-1 sending: " + msg);

			String received = exchanger.exchange(msg);

			System.out.println("Thread-1 received: " + received);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyThread22 extends Thread {
	Exchanger<String> exchanger;

	MyThread22(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	public void run() {
		try {
			String msg = "Hi";
			System.out.println("Thread-2 sending: " + msg);

			String received = exchanger.exchange(msg);

			System.out.println("Thread-2 received: " + received);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Program22 {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		Exchanger<String> exchanger = new Exchanger<>();
		System.out.println("Exchanger created");
		MyThread12 t1 = new MyThread12(exchanger);
		MyThread22 t2 = new MyThread22(exchanger);
		t1.start();
		t2.start();
		

	}
}
