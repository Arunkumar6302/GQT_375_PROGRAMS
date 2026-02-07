package com.gqt.exceptionhandling;

import java.util.Formatter;
import java.util.FormatterClosedException;

public class Program22 {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		f.close();
		try {
			f.format("Hello");
		} catch (FormatterClosedException e) {
			System.out.println("Formatter already closed");
		}
	}
}
