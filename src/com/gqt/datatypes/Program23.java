package com.gqt.datatypes;

import java.util.Arrays;

public class Program23 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		System.out.println("Array Element :\n" + Arrays.deepToString(a));
		int sum = 0;

		for (int i = 0; i < 2; i++) {
			sum += a[i][i];
		}
		System.out.println("Sum Of Diagonal Elements in Array : " + sum);
	}
}
