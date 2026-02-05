package com.gqt.introduction;

public class Program6 {
	public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        double d = b * b - 4 * a * c;

        if (d >= 0) {
            System.out.println((-b + Math.sqrt(d)) / (2 * a));
            System.out.println((-b - Math.sqrt(d)) / (2 * a));
        } else {
            System.out.println("No real roots");
        }
    }
}
