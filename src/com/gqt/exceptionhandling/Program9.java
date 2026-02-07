package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter array size: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Array created");
		} catch (NegativeArraySizeException e) {
			System.out.println("Negative size not allowed");
		}
	}
}
