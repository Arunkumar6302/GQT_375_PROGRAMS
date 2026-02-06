package com.gqt.Strings;

public class Program9 {
	public static void main(String[] args) {
		String s = "Java is very powerful";
		System.out.println("String : "+s);
		String[] words = s.split(" ");
		String longest = words[0];

		for (String w : words) {
			if (w.length() > longest.length()) {
				longest = w;
			}
		}
		System.out.println("Longest Word in The String : \n"+longest);
	}
}
