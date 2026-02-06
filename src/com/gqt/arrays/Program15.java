package com.gqt.arrays;

import java.util.Arrays;

public class Program15 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int key = 20;
		System.out.println("Array Elements : ");
		System.out.println(Arrays.toString(a));
		System.out.println("The Key Element Present at the index : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println(i);
			}
		}

	}
}
