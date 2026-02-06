package com.gqt.datatypes;

import java.math.BigInteger;
import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		BigInteger fact = BigInteger.ONE;

		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial Of a given number : " + fact);
	}
}
