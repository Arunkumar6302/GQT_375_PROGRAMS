package com.gqt.operators;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
//		int a = 12, b = 18, 
		int lcm;
		if(a>b) {
			lcm=a;
		}else {
			lcm=b;
		}
		while (true) {
			if (lcm % a == 0 && lcm % b == 0) {
				System.out.println("Lcm of two numbers : "+lcm);
				break;
			}
			lcm++;
		}
	}
}
