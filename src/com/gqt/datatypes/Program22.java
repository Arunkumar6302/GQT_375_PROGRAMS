package com.gqt.datatypes;

import java.util.Arrays;

public class Program22 {
	public static void main(String[] args) {
        int[] a = {4, 1, 3, 2};
        System.out.println("Array Element :\n" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Second Samllest : "+a[1]);
        System.out.println("Second Largest : "+a[a.length-2]);
    }
}
