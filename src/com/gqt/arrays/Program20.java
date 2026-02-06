package com.gqt.arrays;

import java.util.Arrays;

public class Program20 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("The Array Elements : \n"+Arrays.deepToString(a));
		int sum = 0;
		System.out.println("Sum of Lower Triangle : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				sum += a[i][j];
			}
		}

		System.out.println(sum);
	}
}
