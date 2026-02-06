package com.gqt.overloading;

class Max {
    static int max(int a, int b) {
        return a > b ? a : b;
    }
    static double max(double a, double b) {
        return a > b ? a : b;
    }
}

public class Program7 {
	public static void main(String[] args) {

		Max m = new Max();
		System.out.println("Maximum of two Numbers using  method overloading : ");
		int res1 = m.max(100, 90);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = m.max(200.3, 200);
		System.out.println(res2);
	}
}
