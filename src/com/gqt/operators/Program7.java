package com.gqt.operators;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		if (n % 5 == 0 && n % 7 == 0) {
			System.out.println("Divisible by both 5 and 7");
		}
		else{
			System.out.println("Not Divisible by both 5 and 7");
		}
	}
}
