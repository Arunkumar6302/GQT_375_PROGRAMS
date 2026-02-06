package com.gqt.overloading;

class Square {
    static int area(int a) {
        return a * a;
    }
    static double area(double a) {
        return a * a;
    }
}
public class Program23 {
	public static void main(String[] args) {
		Square s = new Square();
		System.out.println("Area of Square using  method overloading : ");
		int res1 = s.area(4);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = s.area(4);
		System.out.println(res2);
	}
}
