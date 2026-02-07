package com.gqt.staticc;

import java.util.Scanner;

public class Program8 {
	static double sqrt(double n) {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a Number :");
		double b = sc.nextInt();
		System.out.println("Square root of given numbers : " + sqrt(b));
        
    }
}
