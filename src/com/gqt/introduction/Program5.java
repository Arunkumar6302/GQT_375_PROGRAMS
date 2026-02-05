package com.gqt.introduction;

import java.util.Scanner;

public class Program5 {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a Number : ");
		int n = sc.nextInt();
		System.out.println("Factorial of a Given Number : "+fact(n));
	}

}
