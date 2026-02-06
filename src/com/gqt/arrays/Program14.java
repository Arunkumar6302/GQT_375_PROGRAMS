package com.gqt.arrays;

import java.util.Arrays;

public class Program14 {
	 public static void main(String[] args) {
	        int[] a = {4, 1, 3, 2};
	        System.out.println("Array Elements : ");
			System.out.println(Arrays.toString(a));
			System.out.println("Second smallest and Second largest Elements in the array : ");
	        Arrays.sort(a);
	        System.out.println(a[1] + " " + a[a.length - 2]);
	    }
}
