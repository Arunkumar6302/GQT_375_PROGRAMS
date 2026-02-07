package com.gqt.staticc;

import java.util.Scanner;

public class Program12 {
	 static double ci(double p, double r, double t) {
	        return p * Math.pow((1 + r / 100), t) - p;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Principle  :");
			double p = sc.nextDouble();
			System.out.println("Enter rate of interest :");
			double r = sc.nextDouble();
			System.out.println("Enter time :");
			double t = sc.nextDouble();
			System.out.println("Compound Interest : " + ci(p,r,t));
	    }
}
