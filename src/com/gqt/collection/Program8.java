package com.gqt.collection;

import java.util.*;

public class Program8 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		System.out.println("Adding Elements into a Queue : ");
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println("Queue elements: " + q);
		System.out.println("Removed element: " + q.remove());
		System.out.println("Queue after removal: " + q);
		System.out.println("-------------");
		System.out.println("Iterating Over Queue : ");
		for(int i: q) {
			System.out.println(i);
		}
	}
}
