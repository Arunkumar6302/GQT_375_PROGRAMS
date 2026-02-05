package com.gqt.operators;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter fahrenheit : ");
		double f = sc.nextDouble();
		double c = (f - 32) * 5 / 9;
		System.out.println("Celcius : "+c);
	}
}
