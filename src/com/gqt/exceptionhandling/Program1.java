package com.gqt.exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	 public static void main(String[] args) {
	        try {
	        	Scanner sc = new Scanner(System.in);
	            int arr[] = {1, 2, 3};
	            System.out.println("Array Elements : \n"+Arrays.toString(arr));
	            System.out.println("Array Length : "+arr.length);
	            System.out.println("Enter th Index you want: ");
	            int i = sc.nextInt();
	            System.out.println(arr[i]);
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Index out of range Provide a valid index ");
	        }
	    }
}
