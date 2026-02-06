package com.gqt.arrays;

public class Program1 {
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int sum = 0;
        System.out.println("Array elemrnts ");
        for (int x : a) {
        	sum += x;
        	System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Sum of array elements : "+sum);
    }
}
