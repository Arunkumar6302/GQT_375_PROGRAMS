package com.gqt.overloading;

class Cylinder {
	static double volume(double r, double h) {
		return 3.14 * r * r * h;
	}

	static double volume(int r, int h) {
		return 3.14 * r * r * h;
	}
}

public class Program4 {
	public static void main(String[] args) {

		Cylinder c = new Cylinder();
		System.out.println("Volume of Cylinder using method overloading : ");
		double res1 = Cylinder.volume(10, 20);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = Cylinder.volume(2.5, 3.1);
		System.out.println(res2);
	}
}
