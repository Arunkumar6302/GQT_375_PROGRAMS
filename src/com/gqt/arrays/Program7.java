package com.gqt.arrays;

import java.util.Arrays;

public class Program7 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3 };
		System.out.println("Array Elemets :");
        System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean visited = false;

			for (int j = 0; j < i; j++)
				if (a[i] == a[j])
					visited = true;

			if (!visited) {
				for (int j = i + 1; j < a.length; j++)
					if (a[i] == a[j])
						count++;
				System.out.println(a[i] + " : " + count);
			}
		}
	}
}
