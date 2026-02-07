package com.gqt.exceptionhandling;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter one number: ");
			int a = sc.nextInt();
			sc.close();
			sc.nextInt();
		} catch (NoSuchElementException e) {
			System.out.println("No input available");
		}
	}
}
