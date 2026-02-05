package com.gqt.introduction;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println("GCD of Two Numbers : "+a);
	}
}
