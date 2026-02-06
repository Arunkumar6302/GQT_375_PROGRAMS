package com.gqt.arrays;

import java.util.Arrays;

public class Program25 {
	public static void main(String[] args) {
		int[] a = { 1, -1, 0, 2 };
		System.out.println("Array Element : \n" + Arrays.toString(a));
		int p = 0, n = 0, z = 0;

		for (int x : a) {
			if (x > 0) {
				p++;
			} else if (x < 0) {
				n++;
			} else {
				z++;
			}
		}
		System.out.println(p + " " + n + " " + z);
	}
}
