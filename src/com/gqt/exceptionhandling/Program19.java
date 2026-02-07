package com.gqt.exceptionhandling;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter date (yyyy-mm-dd): ");
            String d = sc.next();
            LocalDate.parse(d);
            System.out.println("Valid date");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        }
    }
}
