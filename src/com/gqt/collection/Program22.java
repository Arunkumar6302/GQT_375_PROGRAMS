package com.gqt.collection;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Program22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
		System.out.print("Adding The Elements into the Queue: ");
		queue.add(50);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

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
