package com.gqt.Strings;

public class Program2 {
	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		System.out.println("String : " + s);
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("Palindromic String ");
		} else {
			System.out.println("Not Palindromic String ");
		}
	}
}
