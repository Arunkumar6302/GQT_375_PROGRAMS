package com.gqt.introduction;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int temp = n % 10;
			sum += temp;
			n /= 10;
		}
		System.out.println("Sum of digitsin given Number :");
		System.out.println(sum);
	}
}
