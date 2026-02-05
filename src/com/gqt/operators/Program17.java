package com.gqt.operators;

public class Program17 {
	public static void reverse(String s) {
		if (s.length() == 0) {
			return;
		}
		System.out.print(s.charAt(s.length() - 1));
		reverse(s.substring(0, s.length() - 1));
	}

	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s);
		System.out.println("Reversed String : ");
		reverse("Java");
	}
}
