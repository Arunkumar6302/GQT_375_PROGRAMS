package com.gqt.staticc;

import java.util.Scanner;

public class Program14 {
	static int area(int s) {
        return s * s;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter side of the Square :");
		int b = sc.nextInt();
		System.out.println("Area of the squre : " + area(b));
    }
}
