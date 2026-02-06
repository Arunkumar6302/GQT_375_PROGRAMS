package com.gqt.datatypes;

public class Program3 {
	public static void main(String[] args) {
        int n = 10;
        System.out.println("Integer to Binary and Binary to Integer");
        String binary = Integer.toBinaryString(n);
        int number = Integer.parseInt(binary, 2);

        System.out.println("Integer to binary : "+binary);
        System.out.println("Binary to Integer : "+number);
    }
}
