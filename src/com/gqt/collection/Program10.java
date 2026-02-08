package com.gqt.collection;

import java.util.Stack;

public class Program10 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println("Adding Elements into the Stack : ");
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Stack elements: " + s);
		System.out.println("Popped element: " + s.pop());
		System.out.println("Stack after pop: " + s);
		System.out.println("--------------------");
		System.out.println("Iterating Over Stack : ");
		for (int i : s) {
			System.out.println(i);
		}
	}
}
