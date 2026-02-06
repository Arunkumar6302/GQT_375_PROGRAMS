package com.gqt.datatypes;

import java.util.Arrays;

public class Program8 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		System.out.println("Array Elements :\n" + Arrays.toString(a));
		int sum = 0;

		for (int i : a) {
			sum += i;
		}
		System.out.println("Average : " + sum / a.length);
	}
}
