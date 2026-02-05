package com.gqt.operators;

import java.util.Scanner;

public class Program12 {
	public static int rev(int n, int r) {
		if (n == 0)
			return r;
		return rev(n / 10, r * 10 + n % 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if (n == rev(n, 0)) {
			System.out.println("Is a Palindrome");
		} else {
			System.out.println("Is not a Palindrome ");
		}
	}
}
