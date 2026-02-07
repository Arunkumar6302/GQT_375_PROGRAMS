package com.gqt.staticc;

import java.util.Scanner;

public class Program13 {
	static int area(int l, int b) {
		return l * b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the Rectanle  :");
		int a = sc.nextInt();
		System.out.println("Enter breadth of the Rectanle :");
		int b = sc.nextInt();
		System.out.println("Area of the Rectanle : " + area(a, b));
	}
}
