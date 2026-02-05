package com.gqt.operators;

import java.util.Scanner;

public class Program16 {
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
//        int n = 7;
		System.out.println("Fibonacii series of given number : ");
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}
