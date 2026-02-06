package com.gqt.arrays;

import java.util.Arrays;

public class Program12 {
	public static void main(String[] args) {
		int[] a = { -1, 2, 3 };
		System.out.println("Array Elements : ");
		System.out.println(Arrays.toString(a));
		System.out.println("Sum of Negative integers int the array : ");
		int sum = 0;
		for (int x : a) {
			if (x < 0) {
				sum += x;
			}
		}
		System.out.println(sum);
	}
}
