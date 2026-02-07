package com.gqt.staticc;

import java.util.Scanner;

public class Program23 {
	static int power(int a, int b) {
		if (b == 0)
			return 1;
		return a * power(a, b - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		System.out.println("Power of two numbers : " + power(a, b));
	}
}
