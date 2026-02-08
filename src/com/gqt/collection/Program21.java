package com.gqt.collection;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Program21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		System.out.print("Adding The Elements into the Queue: ");
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println("Queue elements after adding:");
		for (Integer item : queue) {
			System.out.println(item);
		}
		System.out.println("Removed element: " + queue.poll());
		System.out.println("Queue after removal:");
		for (Integer item : queue) {
			System.out.println(item);
		}
	}
}
