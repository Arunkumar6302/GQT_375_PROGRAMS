package com.gqt.operators;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int y = sc.nextInt();
		
		if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
			System.out.println("Leap year");
		}else {
			System.out.println("Not a Leap Year ");
		}
	}
}