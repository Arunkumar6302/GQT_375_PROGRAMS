package com.gqt.introduction;

public class Program3 {
	public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Elements Before Swaping :");
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Elements After Swaping :");
        System.out.println(a + " " + b);
    }
}
