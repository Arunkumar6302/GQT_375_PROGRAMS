package com.gqt.overloading;

class CI {
	static double calc(double p, double r, double t) {
		return p * Math.pow(1 + r / 100, t);
	}

	static double calc(int p, int r, int t) {
		return p * Math.pow(1 + r / 100.0, t);
	}
}

public class Program18 {
	public static void main(String[] args) {
		CI ci = new CI();
		System.out.println("Calculate Compound Interest using  method overloading : ");
		double res1 = ci.calc(10000,100,2);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = ci.calc(20000,100,2);
		System.out.println(res2);
	}
}
