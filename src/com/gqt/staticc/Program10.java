package com.gqt.staticc;

import java.util.Scanner;

public class Program10 {
	static double si(double p, double t, double r) {
		return (p * t * r) / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle  :");
		double p = sc.nextDouble();
		System.out.println("Enter time :");
		double t = sc.nextDouble();
		System.out.println("Enter rate of interest :");
		double r = sc.nextDouble();
		System.out.println("Simple Interest : " + si(p,t,r));
	}
}
