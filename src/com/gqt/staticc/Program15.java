package com.gqt.staticc;

import java.util.Scanner;

public class Program15 {

	static double area(double d1, double d2) {
		return 0.5 * d1 * d2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter diamter 1 of the rhombus  :");
		double a = sc.nextDouble();
		System.out.println("Enter diamter 2 of the rhombus  :");
		double b = sc.nextDouble();
		System.out.println("Area of the Rhombus : " + area(a, b));
	}
}
