package com.gqt.abstraction;

abstract class Shape2 {
	abstract void calculateArea();

	abstract void calculatePerimeter();
}
class Triangle2 extends Shape2 {
	void calculateArea() {
		System.out.println("Triangle Area: 20");
	}
	void calculatePerimeter() {
		System.out.println("Triangle Perimeter: 15");
	}
}
class Circle2 extends Shape2 {
	void calculateArea() {
		System.out.println("Circle Area: 153.94");
	}
	void calculatePerimeter() {
		System.out.println("Circle Perimeter: 43.96");
	}
}
public class Program11 {
	public static void main(String[] args) {
		System.out.println("Trainglr Details :");
		Triangle2 t = new Triangle2();
		t.calculateArea();
		t.calculatePerimeter();
		System.out.println("-------------------------");
		System.out.println("Circle Details : ");
		Circle2 c = new Circle2();
		c.calculateArea();
		c.calculatePerimeter();
	}
}
