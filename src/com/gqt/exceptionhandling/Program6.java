package com.gqt.exceptionhandling;

import java.io.IOException;

public class Program6 {
	public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("IO Exception handled");
        }
    }
}
