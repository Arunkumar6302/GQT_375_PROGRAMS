package com.gqt.collection;

import java.util.ArrayDeque;

public class Program11 {
	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		System.out.println("Addding Elements into ArrayDeque : ");
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.addFirst(5);
		dq.addLast(40);
		System.out.println("ArrayDeque elements: " + dq);
		System.out.println("Removed element: " + dq.remove());
		System.out.println("ArrayDeque after removal: " + dq);
		System.out.println("--------------------");
		System.out.println("Iterating Over ArrayDeque : ");
		for (int i : dq) {
			System.out.println(i);
		}
		
	}
}
