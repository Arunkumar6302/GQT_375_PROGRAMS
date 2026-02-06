package com.gqt.overloading;

class Triangle {
	static double area(int b, int h) {
		return 0.5 * b * h;
	}

	static double area(double b, double h) {
		return 0.5 * b * h;
	}
}

public class Program14 {
	public static void main(String[] args) {

		Triangle t = new Triangle();
		System.out.println("Area of a Traingle using  method overloading : ");
		double res1 = t.area(4,5);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = t.area(9,7);
		System.out.println(res2);
	}
}
