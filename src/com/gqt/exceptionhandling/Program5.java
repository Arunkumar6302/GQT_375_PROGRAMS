package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter number: ");
			String s = sc.next();
			int n = Integer.parseInt(s);
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format Provide Valid Integer");
		}
	}
}
