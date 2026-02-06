package com.gqt.arrays;

import java.util.Arrays;

public class Program16 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println("Array elements : ");
		System.out.println(Arrays.toString(arr));
		int first = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = first;
		System.out.println("Array elements after left rotate : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
