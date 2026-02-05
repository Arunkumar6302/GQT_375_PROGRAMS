package com.gqt.introduction;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();

		int  sum = 0;
		int temp = n;

		while (temp > 0) {
			int d = temp % 10;
			sum += d * d * d;
			temp /= 10;
		}
		if(sum==n) {
			System.out.println(n+"is a Armstrong Number : ");
		}else {
			System.out.println(n+"is not a Armstrong Number : ");
		}
	}
}
