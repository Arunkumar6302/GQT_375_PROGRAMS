package com.gqt.exceptionhandling;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        try {
        	System.out.println("Enter a Number : ");
            sc.nextInt();
        } catch (IllegalStateException e) {
            System.out.println("Scanner is closed");
        }
    }
}
