package com.gqt.arrays;

public class Program2 {

	public static void main(String[] args) {
		int[] a = { 5, 2, 9, 1 };
		int max = a[0], min = a[0];
		 System.out.println("Array elemrnts ");
		for (int x : a) {
			if (x > max)
				max = x;
			if (x < min)
				min = x;
			System.out.print(x+" ");
        }
        System.out.println();
		System.out.println(max + " " + min);

	}

}
