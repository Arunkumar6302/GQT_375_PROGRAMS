package com.gqt.datatypes;

public class Program16 {
	public static void main(String[] args) {
		String s = "Java";
		System.out.println("String : " + s);
		System.out.println("Reversed String : ");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
