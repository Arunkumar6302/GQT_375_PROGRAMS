package com.gqt.collection;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Program25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			queue.add(sc.nextInt());
		}
		System.out.println("Queue elements: " + queue);
		System.out.println("Removed element: " + queue.poll());
		System.out.println("------------------");
		System.out.println("Iterating Queue Elements : ");
		for(int i: queue) {
			System.out.println(i);
		}
	}
}
