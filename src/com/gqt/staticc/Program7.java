package com.gqt.staticc;

import java.util.Scanner;

public class Program7 {
	 static double power(double a, double b) {
	        return Math.pow(a, b);
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter first Number :");
			double a = sc.nextInt();
			System.out.println("Enter Second Number :");
			double b = sc.nextInt();
			System.out.println("Power of two numbers : " + power(a, b));
	        
	    }
}
