package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter class Name : ");
			String s = sc.next();
			Class.forName(s);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}
	}
}
