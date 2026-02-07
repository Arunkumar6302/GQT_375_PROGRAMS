package com.gqt.staticc;

import java.util.Scanner;

public class Program16 {
	static int area(int b, int h) {
		return b * h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of the Parallelogram  :");
		int a = sc.nextInt();
		System.out.println("Enter Height of the Parallelogram :");
		int b = sc.nextInt();
		System.out.println("Area of the Parallelogram : " + area(a, b));
	}
}
