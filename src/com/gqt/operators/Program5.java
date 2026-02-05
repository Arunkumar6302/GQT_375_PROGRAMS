package com.gqt.operators;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle : "+Math.PI * r * r);
    }
}
