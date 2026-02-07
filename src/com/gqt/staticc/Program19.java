package com.gqt.staticc;

import java.util.Scanner;

public class Program19 {
	static double convert(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter celcius :");
    	double ci = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit : "+convert(ci));
    }
}
