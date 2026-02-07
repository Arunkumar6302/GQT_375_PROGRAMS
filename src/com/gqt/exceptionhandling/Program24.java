package com.gqt.exceptionhandling;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class Program24 {
	public static void main(String[] args) {
		try {
			ByteBuffer b = ByteBuffer.allocate(2);
			b.get();
		} catch (BufferUnderflowException e) {
			System.out.println("Buffer underflow");
		}
	}
}
