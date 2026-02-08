package com.gqt.multiThreading;

class JoinThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(getName() + " running");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Program5 {
	public static void main(String[] args) throws Exception {
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		t1.start();
		t1.join();
		t2.start();
	}
}
