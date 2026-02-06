package com.gqt.overloading;

class Sqrt {
	static double root(int n) {
		return Math.sqrt(n);
	}

	static double root(double n) {
		return Math.sqrt(n);
	}
}

public class Program11 {
	public static void main(String[] args) {

		Sqrt p = new Sqrt();
		System.out.println("Square root of a number using  method overloading : ");
		double res1 = p.root(4);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = p.root(9);
		System.out.println(res2);
	}
}
