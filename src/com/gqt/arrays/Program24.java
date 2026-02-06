package com.gqt.arrays;

import java.util.Arrays;

public class Program24 {
	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 1 };
		System.out.println("Array Elements : \n" + Arrays.toString(a));
		int k = 1;
		Arrays.sort(a);
		System.out.println(k + "Kth Smallest Element and Largest Element : ");
		System.out.println(a[k - 1] + " " + a[a.length - k]);
	}
}
