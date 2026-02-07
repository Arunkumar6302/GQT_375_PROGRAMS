package com.gqt.exceptionhandling;

public class Program8 {
	static void show() {
		show();
	}

	public static void main(String[] args) {
		try {
			show();
		} catch (StackOverflowError e) {
			System.out.println("Stack overflow");
		}
	}
}
