package com.gqt.staticc;

import java.util.Arrays;

public class Program4 {
	static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Array Elements : "+Arrays.toString(arr));
        System.out.println("Sum of Array Elements : "+sum(arr));
    }
}
