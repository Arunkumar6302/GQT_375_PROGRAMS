package com.gqt.exceptionhandling;

public class Program18 {
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new SecurityManager());
			System.exit(0);
		} catch (SecurityException e) {
			System.out.println("Security exception occurred");
		}
	}
}
