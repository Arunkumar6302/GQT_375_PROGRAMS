package com.gqt.overloading;

class Circle {
	static double area(int r) {
		return 3.14 * r * r;
	}

	static double area(double r) {
		return 3.14 * r * r;
	}
}

public class Program13 {
	public static void main(String[] args) {

		Circle c = new Circle();
		System.out.println("Area of Circle using  method overloading : ");
		double res1 = c.area(4);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = c.area(9);
		System.out.println(res2);
	}
}
