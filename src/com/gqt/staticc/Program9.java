package com.gqt.staticc;

import java.util.Scanner;

public class Program9 {
	static double area(double b, double h) {
		return 0.5 * b * h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of the triangle  :");
		double a = sc.nextInt();
		System.out.println("Enter breadth of the triangle :");
		double b = sc.nextInt();
		System.out.println("Area of the Triangle : " + area(a, b));
	}
}
