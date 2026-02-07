package com.gqt.staticc;

import java.util.Scanner;

public class Program20 {
	 static double convert(double f) {
	        return (f - 32) * 5 / 9;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter Fahrenheit :");
	    	double fi = sc.nextDouble();
	        System.out.println("Fahrenheit to Celsius : "+convert(fi));
	    }
}
