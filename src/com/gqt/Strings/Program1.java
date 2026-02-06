package com.gqt.Strings;

public class Program1 {
	public static void main(String[] args) {
		String s = "Java";
		String rev = "";
		System.out.println("String : " + s);

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("Reversed String : \n" + rev);
	}
}
