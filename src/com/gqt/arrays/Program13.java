package com.gqt.arrays;

import java.util.Arrays;

public class Program13 {
	public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println("Array Elements : ");
		System.out.println(Arrays.toString(a));
		System.out.println("Product of Elements in the array : ");
        int prod = 1;
        for (int x : a) {
        	prod *= x;
        }
        System.out.println(prod);
    }
}
