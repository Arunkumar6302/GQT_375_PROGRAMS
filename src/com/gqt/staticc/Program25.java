package com.gqt.staticc;

public class Program25 {
	static String reverse(String s) {
		if (s.isEmpty()) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		String s = "JAVA";
		System.out.println("String : " + s);
		System.out.println("Reversed String : " + reverse(s));
	}
}
