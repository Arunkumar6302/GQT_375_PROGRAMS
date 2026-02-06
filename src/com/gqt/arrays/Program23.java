package com.gqt.arrays;

import java.util.Arrays;

public class Program23 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int minRow = a[0][0], col = 0;
		System.out.println("The Array Elements : \n" + Arrays.deepToString(a));

		for (int j = 1; j < 3; j++) {
			if (a[0][j] < minRow) {
				minRow = a[0][j];
				col = j;
			}
		}

		boolean saddle = true;
		for (int i = 0; i < 3; i++) {
			if (a[i][col] > minRow) {
				saddle = false;
			}
		}
		if (saddle) {
			System.out.println("Sadle ");
		} else {
			System.out.println("No Saddle");
		}

	}
}
