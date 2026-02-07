package com.gqt.staticc;

import java.util.Scanner;

public class Program11 {
	static double volume(double r, double h) {
		return 3.14 * r * r * h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the Cylinder  :");
		double a = sc.nextDouble();
		System.out.println("Enter height of the Cylinder :");
		double b = sc.nextDouble();
		System.out.println("Volume of the cylinder : " + volume(a, b));
		
	}
}
