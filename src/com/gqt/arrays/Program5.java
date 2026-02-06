package com.gqt.arrays;

public class Program5 {
	public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println("Array Elements : ");
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array Elements : ");
        for (int i = a.length - 1; i >= 0; i--) {
        	System.out.print(a[i] + " ");
        }
    }
}
