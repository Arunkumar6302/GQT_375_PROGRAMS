package com.gqt.overloading;

class Parallelogram {
	static int area(int b, int h) {
		return b * h;
	}

	static double area(double b, double h) {
		return b * h;
	}
}

public class Program21 {
	public static void main(String[] args) {
		Parallelogram p = new Parallelogram();
		System.out.println("Area of the Parallelogram using  method overloading : ");
		int res1 = p.area(100, 2);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = p.area(100, 3);
		System.out.println(res2);
	}
}
