package com.gqt.arrays;

import java.util.Arrays;

public class Program19 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		System.out.println("Array Elements :   ");
		System.out.println(Arrays.deepToString(a));

		for (int i = 0; i < 3; i++) {
			for (int j = i; j <3; j++) {
				sum += a[i][j];
			}
		}

		System.out.println("Sum of upper traianle : " + sum);
	}
}
