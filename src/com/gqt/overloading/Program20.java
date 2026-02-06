package com.gqt.overloading;

class Trapezoid {
	static double area(int a, int b, int h) {
		return 0.5 * (a + b) * h;
	}

	static double area(double a, double b, double h) {
		return 0.5 * (a + b) * h;
	}
}
public class Program20 {
	public static void main(String[] args) {
		Trapezoid t = new Trapezoid();
		System.out.println("Area of the Trapezoid using  method overloading : ");
		double res1 = t.area(10000, 100, 2);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = t.area(20000, 100, 2);
		System.out.println(res2);
	}
}
