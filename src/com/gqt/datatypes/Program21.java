package com.gqt.datatypes;

import java.util.Arrays;

public class Program21 {
	public static void main(String[] args) {
		int[] a = { 3, 1, 2 };
		System.out.println("Array Element :\n" + Arrays.toString(a));
		System.out.println("Array Elements After Sorting : ");
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
