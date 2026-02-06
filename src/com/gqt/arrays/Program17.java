package com.gqt.arrays;

import java.util.Arrays;

public class Program17 {
	public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Array Elements : ");
        System.out.println(Arrays.deepToString(a));
        int top=0,bottom=2,left=0,right=2;
        System.out.println("Spiral matrix of the Array Elements : ");
        while (top<=bottom && left<=right) {
            for (int i=left;i<=right;i++) {
            	System.out.print(a[top][i]+" ");
            }
            top++;
            for (int i=top;i<=bottom;i++) {
            	System.out.print(a[i][right]+" ");
            }
            right--;
            for (int i=right;i>=left;i--) {
            	System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            for (int i=bottom;i>=top;i--) {
            	System.out.print(a[i][left]+" ");
            }
            left++;
        }
    }
}
