package com.gqt.staticc;

import java.util.Scanner;

public class Program3 {
	static double area(double r) {
		return 3.14 * r * r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Radius :");
		int n = sc.nextInt();
		System.out.println("Area Of Circle : " + area(n));
	}
}
