package com.gqt.operators;

public class Program21 {
	public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of a triangle : "+area);
    }
}
