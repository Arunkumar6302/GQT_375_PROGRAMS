package com.gqt.arrays;

import java.util.Arrays;

public class Program21 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		System.out.println("The Array Elements : \n"+Arrays.deepToString(a));
		for (int i = 0; i < a.length; i++) {
			int rsum = 0, csum = 0;
			for (int j = 0; j < a.length; j++) {
				rsum += a[i][j];
				csum += a[j][i];
			}
			System.out.println("Sum of row and col sum from the array \n"+rsum + " " + csum);
		}
	}
}
