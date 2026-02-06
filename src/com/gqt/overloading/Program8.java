package com.gqt.overloading;

class Min {
	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static double min(double a, double b) {
		return a < b ? a : b;
	}
}

public class Program8 {
	public static void main(String[] args) {

		Min m = new Min();
		System.out.println("Minimum of two Numbers using  method overloading : ");
		int res1 = m.min(100, 90);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = m.min(200.3, 200);
		System.out.println(res2);
	}
}
