package com.gqt.arrays;

import java.util.Arrays;

public class Program22 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 2, 1 } };
		System.out.println("The Array Elements : \n" + Arrays.deepToString(a));
		boolean sym = true;
		System.out.println("Symetric Matrix : ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (a[i][j] != a[j][i]) {
					sym = false;
				}
			}
		}

		System.out.println(sym);
	}
}
