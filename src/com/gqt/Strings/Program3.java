package com.gqt.Strings;

public class Program3 {
	public static void main(String[] args) {
		String s = "java";
		int v = 0, c = 0;
		System.out.println("String :" + s);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ("aeiou".indexOf(ch) != -1) {
				v++;
			} else {
				c++;
			}
		}
		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);
	}
}
