package com.gqt.arrays;

import java.util.Arrays;

public class Program18 {
	public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println("Array Elements :  ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Is both ararays are equal - "+Arrays.equals(a, b));
    }
}
