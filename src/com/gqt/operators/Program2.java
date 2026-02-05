package com.gqt.operators;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}
