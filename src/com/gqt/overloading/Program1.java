package com.gqt.overloading;

public class Program1 {
	static int add(int a, int b) {
		return a + b;
	}

	static float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		Program1 p1 = new Program1();
		System.out.println("sum of two integers using method overloading ");
		int res1 = Program1.add(10, 20);
		System.out.println(res1);
		System.out.println("--------------------");
		float res2 = Program1.add(2.5f, 3.1f);
		System.out.println(res2);
	}
}
