package com.gqt.overloading;

class Sphere {
    static double volume(int r) {
        return (4.0 / 3) * 3.14 * r * r * r;
    }
    static double volume(double r) {
        return (4.0 / 3) * 3.14 * r * r * r;
    }
}

public class Program16 {
	public static void main(String[] args) {

		Sphere s = new Sphere();
		System.out.println("Volume of Sphere using  method overloading : ");
		double res1 = s.volume(4);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = s.volume(9);
		System.out.println(res2);
	}
}
