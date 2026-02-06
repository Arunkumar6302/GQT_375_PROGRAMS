package com.gqt.datatypes;

import java.util.Arrays;

public class Program6 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		System.out.println("Array Elements : \n" + Arrays.toString(arr));
		for (int i : arr)
			System.out.println(i);
	}
}
