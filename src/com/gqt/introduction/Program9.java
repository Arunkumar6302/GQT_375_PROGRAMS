package com.gqt.introduction;

public class Program9 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
            System.out.print(num+", ");
        }
        System.out.println();
        
        System.out.println("Second Largest Element : "+second);
    }
}
