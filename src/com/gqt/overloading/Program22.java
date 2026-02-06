package com.gqt.overloading;

class SI {
	static int calc(int p, int r, int t) {
		return (p * r * t) / 100;
	}

	static double calc(double p, double r, double t) {
		return (p * r * t) / 100;
	}
}

public class Program22 {
	public static void main(String[] args) {
		SI si = new SI();
		System.out.println("Finding Simple Interest using  method overloading : ");
		int res1 = si.calc(2000, 100, 2);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = si.calc(3000, 100, 3);
		System.out.println(res2);
	}
}
