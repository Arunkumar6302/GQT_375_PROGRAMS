package com.gqt.overloading;

class Power {
	static int power(int a, int b) {
		return (int) Math.pow(a, b);
	}

	static double power(double a, int b) {
		return Math.pow(a, b);
	}
}

public class Program9 {
	public static void main(String[] args) {

		Power p = new Power();
		System.out.println("Power of two Numbers using  method overloading : ");
		int res1 = p.power(2,3);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = p.power(3,2);
		System.out.println(res2);
	}
}
