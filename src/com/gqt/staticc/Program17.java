package com.gqt.staticc;

import java.util.Scanner;

public class Program17 {
	static double area(double a, double b, double h) {
		return 0.5 * (a + b) * h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  :");
		double a = sc.nextDouble();
		System.out.println("Enter breadth :");
		double b = sc.nextDouble();
		System.out.println("Enter height :");
		double h = sc.nextDouble();
		System.out.println("Area of trapezoid : " + area(a, b, h));
	}
}
