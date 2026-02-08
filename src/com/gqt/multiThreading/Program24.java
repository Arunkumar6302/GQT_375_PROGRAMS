package com.gqt.multiThreading;

import java.util.concurrent.*;

class MyReceiverThread extends Thread {
	TransferQueue<String> queue;

	MyReceiverThread(TransferQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			System.out.println("Receiver waiting to take data");
			String data = queue.take();
			System.out.println("Receiver got: " + data);
		} catch (Exception e) {
		}
	}
}

public class Program24 {
	public static void main(String[] args) throws Exception {
		TransferQueue<String> queue = new LinkedTransferQueue<>();
		MyReceiverThread t1 = new MyReceiverThread(queue);
		t1.start();
		System.out.println("Main thread transferring data");
		queue.transfer("Transferred Data");
		System.out.println("Data transfer completed");
	}
}
