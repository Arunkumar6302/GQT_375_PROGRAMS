package com.gqt.datatypes;

import java.util.Arrays;

public class Program7 {
	public static void main(String[] args) {
		int[] a = { 5, 2, 9, 1 };
		System.out.println("Array Elements :\n" + Arrays.toString(a));
		int max = a[0], min = a[0];

		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Maximum Element : " + max);
		System.out.println("Minimum Element : " + min);
	}
}
