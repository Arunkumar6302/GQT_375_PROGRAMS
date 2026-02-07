package com.gqt.staticc;

import java.util.Scanner;

class Factorial {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}
public class Program2 {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
        System.out.println("Factorial of given Number : "+f.fact(n));
    }
}
