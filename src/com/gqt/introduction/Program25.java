package com.gqt.introduction;

import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
        System.out.println("A to the power of B : "+Math.pow(a, b));
    }
}
