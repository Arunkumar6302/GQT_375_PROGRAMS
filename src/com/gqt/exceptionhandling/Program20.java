package com.gqt.exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter regex pattern: ");
			String p = sc.next();
			Pattern.compile(p);
			System.out.println("Pattern complted");
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid regex pattern");
		}
	}
}
