package com.gqt.staticc;

import java.util.Scanner;

public class Program21 {
	static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  :");
		int n = sc.nextInt();
		System.out.println("Fcatorial of given number : " + fact(n));
	}
}
