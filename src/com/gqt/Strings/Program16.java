package com.gqt.Strings;

public class Program16 {
	public static void main(String[] args) {
		String s = "programming";
		System.out.println("String :"+s);
		System.out.println("Duplicate Elements in Strings :");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(i));
				}
			}
		}
	}
}
