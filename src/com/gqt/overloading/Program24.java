package com.gqt.overloading;

class Rhombus {
    static int area(int d1, int d2) {
        return (d1 * d2) / 2;
    }
    static double area(double d1, double d2) {
        return (d1 * d2) / 2;
    }
}
public class Program24{
	public static void main(String[] args) {
		Rhombus r = new Rhombus();
		System.out.println("Area of Rhombus using  method overloading : ");
		int res1 = r.area(4,6);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = r.area(4,9);
		System.out.println(res2);
	}
}
