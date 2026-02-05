package com.gqt.operators;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		boolean prime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("It is Prime Number ");
		} else {
			System.out.println("It is not a Prime Number ");
		}
	}
}
