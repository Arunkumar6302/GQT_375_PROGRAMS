package com.gqt.overloading;

class Perimeter {
	static int calc(int l, int b) {
		return 2 * (l + b);
	}

	static double calc(double l, double b) {
		return 2 * (l + b);
	}
}

public class Program12 {
	public static void main(String[] args) {

		Perimeter p = new Perimeter();
		System.out.println("Perimeter of a Rectagle using  method overloading : ");
		double res1 = p.calc(4, 5);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = p.calc(9, 7);
		System.out.println(res2);
	}
}
