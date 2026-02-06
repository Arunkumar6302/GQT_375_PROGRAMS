package com.gqt.datatypes;

public class Program14 {
	public static void main(String[] args) {
        String s = "banana";
        char ch = 'a';
        int count = 0;
        System.out.println("String : "+s);
        System.out.println("Character: "+ch);
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
            	count++;
            }
        }

        System.out.println("Character count : "+count);
    }
}
