package com.gqt.arrays;

public class Program3 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = new int[a.length];
		System.out.println("First array elements :");

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array elements after copping it into new Array");
		for (int x : b) {
			System.out.print(x + " ");
		}

	}

}
