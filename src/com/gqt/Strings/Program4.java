package com.gqt.Strings;

public class Program4 {
	public static void main(String[] args) {
        String s = "banana";
        char ch = 'a';
        System.out.println("String : "+s);
        System.out.println("Character: "+ch);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
            	count++;
            }
        }
        System.out.println("Count of Character in the String : "+count);
    }
}
