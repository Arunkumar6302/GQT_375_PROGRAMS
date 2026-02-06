package com.gqt.Strings;

import java.util.Arrays;

public class Program10 {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println("String 1 :" + s1);
		System.out.println("String 2 :" + s2);

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("Anagaramic string ");
		} else {
			System.out.println("Not An Anagramic String ");
		}
	}
}
