package com.gqt.Strings;

public class Program21 {
	public static void main(String[] args) {
		String s = "banana";
		String result = "";
		System.out.println("String :" + s);
		System.out.println("String after removing duplicates : ");
		for (char ch : s.toCharArray()) {
			if (!result.contains(ch + "")) {
				result += ch;
			}
		}
		System.out.println(result);
	}
}
