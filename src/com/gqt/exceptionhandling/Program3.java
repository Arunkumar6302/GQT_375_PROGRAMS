package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = null;
			System.out.println("String : "+s);
			System.out.print("Enter length to check: ");
			sc.next();
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Null value used Provide some Value to the String ");
		}
	}
}
