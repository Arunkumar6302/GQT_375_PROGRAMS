package com.gqt.abstraction;

abstract class Shape1 {
	abstract void draw();
}

class Triangle extends Shape1 {
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

class Circle1 extends Shape1 {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Program2 {
	public static void main(String[] args) {
		Triangle s = new Triangle();
		s.draw();
		Circle1 c = new Circle1();
		c.draw();
	}
}
