package com.gqt.exceptionhandling;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Program21 {
	public static void main(String[] args) {
		try {
			ResourceBundle rb = ResourceBundle.getBundle("abc");
		} catch (MissingResourceException e) {
			System.out.println("Resource not found");
		}
	}
}
