package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter sleep time (ms): ");
			int t = sc.nextInt();
			Thread.sleep(t);
			System.out.println("Thread completed");
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}
