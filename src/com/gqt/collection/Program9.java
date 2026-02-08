package com.gqt.collection;

import java.util.*;

public class Program9 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println("Adding Elements into a Queue : ");
		pq.add(40);
		pq.add(10);
		pq.add(20);

		System.out.println("Queue elements: " + pq);
		System.out.println("Removed element: " + pq.remove());
		System.out.println("Queue after removal: " + pq);
		System.out.println("--------------------");
		System.out.println("Iterating Over Queue : ");
		for (int i : pq) {
			System.out.println(i);
		}
	}
}
