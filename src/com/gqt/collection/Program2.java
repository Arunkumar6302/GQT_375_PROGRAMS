package com.gqt.collection;

import java.util.LinkedList;

public class Program2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Adding elements to LinkedList");
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("LinkedList: " + list);
		System.out.println("Removing first element");
		list.removeFirst();
		System.out.println("Remaining elements:");
		for (int i : list) {
			System.out.println(i);
		}
	}
}
