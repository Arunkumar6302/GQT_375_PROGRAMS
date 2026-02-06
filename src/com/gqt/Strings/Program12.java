package com.gqt.Strings;

public class Program12 {
	public static void main(String[] args) {
		String s = "12345";
		System.out.println("String :" + s);
		boolean isDigit = true;

		for (char ch : s.toCharArray()) {
			if (!Character.isDigit(ch)) {
				isDigit = false;
				break;
			}
		}
		if (isDigit) {
			System.out.println("String Contains Only Digits ");
		} else {
			System.out.println("String not Contains Only Digits ");
		}
	}
}
