package com.gqt.introduction;

public class Program12 {
	public static void main(String[] args) {
        String s = "banana";
        char ch = 'a';
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == ch) {
            	count++;
            }
        }
        System.out.println("Count of occurance : "+count);
    }
}
