package com.gqt.abstraction;

abstract class Shapeee {
	abstract void area();
	abstract void perimeter();
}

class Circleee extends Shapeee {
	void area() {
		System.out.println("Circle Area");
	}
	void perimeter() {
		System.out.println("Circle Perimeter Area");
	}
}
class Rectangleee extends Shapeee{
	void area() {
		System.out.println("Rectangle Area");
	}
	void perimeter() {
		System.out.println("Rectangle Perimeter Area");
	}
}
public class Program23 {
	public static void main(String[] args) {
		System.out.println("Circle Details :");
		Circleee s = new Circleee();
		s.area();
		s.perimeter();
		System.out.println("----------------");
		System.out.println("Rectangle Details : ");
		Rectangleee t = new Rectangleee();
		t.area();
		t.perimeter();
	}
}
