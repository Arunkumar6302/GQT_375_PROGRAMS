package com.gqt.collection;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Program23 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SynchronousQueue<Integer> queue = new SynchronousQueue<>();

		System.out.print("Enter an element: ");
		int value = sc.nextInt();

		new Thread(() -> {
			try {
				queue.put(value);
				System.out.println("Element added: " + value);
			} catch (Exception e) {
			}
		}).start();

		System.out.println("Element removed: " + queue.take());
	}
}
