package com.gqt.overloading;

class Average {
	static int avg(int a, int b, int c) {
		return (a + b + c) / 3;
	}

	static double avg(double a, double b, double c) {
		return (a + b + c) / 3;
	}
}

public class Program6 {
	public static void main(String[] args) {

		Average a = new Average();
		System.out.println("Average of three Numbers using  method overloading : ");
		int res1 = a.avg(10, 20, 30);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = a.avg(10.2, 20.5, 30.1);
		System.out.println(res2);
	}
}
