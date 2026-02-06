package com.gqt.arrays;


public class Program4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};

        System.out.print("Unique Elements: ");
        for (int i = 0; i < a.length; i++) {
            boolean dup = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    dup = true;
                    break;
                }
            }

            if (!dup) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

