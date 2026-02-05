package com.gqt.operators;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Addition: "+(a + b));
        System.out.println("Subtrcation:"+(a-b));
        System.out.println("Multiplication: "+(a * b));
        System.out.println("Division: "+(a / b));
    }
}
