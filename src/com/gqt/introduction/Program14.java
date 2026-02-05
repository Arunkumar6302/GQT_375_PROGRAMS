package com.gqt.introduction;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Decimal to Binary Conversion: ");
        System.out.println(Integer.toBinaryString(n));
    }
}
