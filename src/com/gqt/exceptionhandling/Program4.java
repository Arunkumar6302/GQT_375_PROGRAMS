package com.gqt.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program4 {
	public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
