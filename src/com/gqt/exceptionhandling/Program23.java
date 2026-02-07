package com.gqt.exceptionhandling;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Program23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			ByteBuffer b = ByteBuffer.allocate(2);
			System.out.print("Enter 3 numbers: ");
			b.put((byte) sc.nextInt());
			b.put((byte) sc.nextInt());
			b.put((byte) sc.nextInt());
		} catch (BufferOverflowException e) {
			System.out.println("Buffer overflow");
		}
	}
}
