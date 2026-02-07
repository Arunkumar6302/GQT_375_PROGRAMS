package com.gqt.staticc;

import java.util.Scanner;

public class Program18 {
	static double area(int n, double s) {
		return (n * s * s) / (4 * Math.tan(Math.PI / n));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n   :");
		int a = sc.nextInt();
		System.out.println("Enter side  :");
		double b = sc.nextDouble();
		System.out.println("Area of the Polygon : " + area(a, b));
	}
}
