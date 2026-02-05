package com.gqt.operators;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int sum = 0;

		while (n > 0) {
			int temp = n % 10;
			sum += temp;
			n /= 10;
		}
		System.out.println("Sum of digits in the given number : " + sum);
	}
}
