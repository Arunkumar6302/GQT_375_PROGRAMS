package com.gqt.overloading;

class Polygon {
    static double area(int n, int s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
    static double area(double n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
}
public class Program25{
	public static void main(String[] args) {
		Polygon p = new Polygon();
		System.out.println("Area of POlygon using  method overloading : ");
		double res1 = p.area(4,6);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = p.area(4,9);
		System.out.println(res2);
	}
}
