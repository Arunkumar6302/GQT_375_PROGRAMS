package com.gqt.arrays;

import java.util.Arrays;

public class Program6 {
	public static void main(String[] args) {
        int[] a = {4, 1, 3, 2};
        System.out.println("Array Elemets :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array in Assending order  : ");
        System.out.println(Arrays.toString(a));
        System.out.println(" Arrays in descending Order :");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}
