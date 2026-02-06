package com.gqt.Strings;

public class Program15 {
	public static void main(String[] args) {
		String s = "Java is easy";
		System.out.println("String :"+s);
		String[] words = s.split(" ");
		System.out.println("Reversed words in String : ");
		for (int i = words.length - 1; i >= 0; i--)
			System.out.print(words[i] + " ");
	}
}
