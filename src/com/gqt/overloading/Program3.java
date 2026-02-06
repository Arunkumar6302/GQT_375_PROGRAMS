package com.gqt.overloading;

public class Program3 {
	static int area(int l, int b) {
		return l * b;
	}

	static double area(double l, double b) {
		return l * b;
	}

	public static void main(String[] args) {
		Program3 p3 = new Program3();
		System.out.println("Area of rectanles using method overloading : ");
		int res1 = Program3.area(10, 20);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = Program3.area(2.5, 3.1);
		System.out.println(res2);
	}
}
