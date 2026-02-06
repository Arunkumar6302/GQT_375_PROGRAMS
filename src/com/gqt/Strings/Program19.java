package com.gqt.Strings;

public class Program19 {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";
		System.out.println("String-1 : " + s1);
		System.out.println("String-2 : " + s2);

		if ((s1 + s1).contains(s2)) {
			System.out.println("String is rotation of another string ");
		} else {
			System.out.println("String is not rortation of another String");
		}
	}
}
