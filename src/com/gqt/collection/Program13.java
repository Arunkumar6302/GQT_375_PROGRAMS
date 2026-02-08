package com.gqt.collection;

import java.util.BitSet;

public class Program13 {
	public static void main(String[] args) {
		BitSet b = new BitSet();
		System.out.println("Adding Elements into A BitSet : ");
		b.set(1);
		b.set(3);
		b.set(2);
		System.out.println("Removed Element : " + b.previousClearBit(1));
		System.out.println("BitSet values: " + b);
		System.out.println("-----------------");

	}
}
