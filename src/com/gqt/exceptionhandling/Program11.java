package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Object a[] = new Integer[2];
			System.out.print("Enter value: ");
			a[0] = sc.next();
		} catch (ArrayStoreException e) {
			System.out.println("Wrong data type");
		}
	}
}
