package com.gqt.abstraction;

abstract class Shape {
	abstract void area();
}

class Circle extends Shape {
	void area() {
		System.out.println("Circle Area");
	}
}
class Rectangle extends Shape {
	void area() {
		System.out.println("Rectangle Area");
	}
}
public class Program1 {
	public static void main(String[] args) {
		Circle s = new Circle();
		s.area();
		Rectangle t = new Rectangle();
		t.area();
	}
}
