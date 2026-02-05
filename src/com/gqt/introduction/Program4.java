package com.gqt.introduction;

import java.util.Scanner;

public class Program4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a Number : ");
	        int n = sc.nextInt();
	        
	        boolean prime = true;

	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                prime = false;
	                break;
	            }
	        }
	        if(prime) {
	        	System.out.println("Is a Prime number ");
	        }else {
	        	System.out.println("Is not a Prime number");
	        }
	    }
}
