package com.gqt.Strings;

public class Program11 {
	public static void main(String[] args) {
		String s = "swiss";
		System.out.println("String : " + s);
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				System.out.println("First Non Repeating Character : " + s.charAt(i));
				break;
			}
		}
	}
}
