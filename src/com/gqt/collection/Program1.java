package com.gqt.collection;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Adding elements to ArrayList");
		list.add("Java");
		list.add("Python");
		list.add("C++");
		System.out.println("ArrayList elements: " + list);
		System.out.println("Removing element: Python");
		list.remove("Python");
		System.out.println("Final elements:");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
