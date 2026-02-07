package com.gqt.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			List<Integer> l = Arrays.asList(1, 2, 3);
			System.out.print("Enter value to add: ");
			int x = sc.nextInt();
			l.add(x);
		} catch (UnsupportedOperationException e) {
			System.out.println("Operation not supported");
		}
	}
}
