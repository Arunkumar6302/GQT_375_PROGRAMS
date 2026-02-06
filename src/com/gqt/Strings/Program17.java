package com.gqt.Strings;

public class Program17 {
	public static void main(String[] args) {
		String s = "programming";
		System.out.println("String :"+s);
		System.out.println("First Repeating Character : ");
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}
