package com.gqt.Strings;

public class Program18 {
	public static void main(String[] args) {
		String str = "java is easy to learn";
		System.out.println("String : "+str);
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		System.out.println("capitalize of first letter of each word ");
		for (String word : words) {
			sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}

		System.out.println(sb.toString().trim());
	}
}
