package com.gqt.staticc;

public class Program1 {
	private static int count = 0;

	public Program1() {
		count++;
	}

	public static int getObjectCount() {
		return count;
	}

	public static void main(String[] args) {
		Program1 obj1 = new Program1();
		Program1 obj2 = new Program1();
		Program1 obj3 = new Program1();

		System.out.println("Total number of objects created: " + Program1.getObjectCount());
	}
}
