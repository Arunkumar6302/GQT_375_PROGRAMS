package com.gqt.exceptionhandling;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Program25 {
	public static void main(String[] args) {
		try {
			LocalDate.of(2024, 13, 1);
		} catch (DateTimeException e) {
			System.out.println("Invalid date");
		}
	}
}
