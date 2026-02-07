package com.gqt.staticc;

import java.util.Scanner;

public class Program5 {
	static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		System.out.println("Maximum of two numbers : " + max(a, b));
	}
}
