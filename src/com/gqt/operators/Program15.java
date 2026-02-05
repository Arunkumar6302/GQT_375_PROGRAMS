package com.gqt.operators;

import java.util.Scanner;

public class Program15 {
	public static int power(int a, int b) {
        if (b == 0) {
        	return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a value : ");
    	int a = sc.nextInt();
    	System.out.println("Enter b value : ");
    	int b = sc.nextInt();
        System.out.println("a to the power of b "+power(a, b));
    }
}
