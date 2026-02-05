package com.gqt.operators;

public class Program4 {
	public static void main(String[] args) {
		
		int a = 5, b = 7;
		System.out.println("Before swapping :");
		System.out.println(a + " " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping :");
		System.out.println(a + " " + b);
	}
}
