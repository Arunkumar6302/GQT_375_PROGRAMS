package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter priority: ");
			int p = sc.nextInt();
			Thread t = new Thread();
			t.setPriority(p);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid priority");
		}
	}
}
