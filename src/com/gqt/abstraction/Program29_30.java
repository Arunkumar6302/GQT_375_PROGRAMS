package com.gqt.abstraction;

abstract class Shape21 {
	abstract void calculateArea();

	abstract void calculatePerimeter();
}
class Triangle21 extends Shape21{
	void calculateArea() {
		System.out.println("Triangle Area: 20");
	}
	void calculatePerimeter() {
		System.out.println("Triangle Perimeter: 15");
	}
}
class Circle21 extends Shape21 {
	void calculateArea() {
		System.out.println("Circle Area: 153.94");
	}
	void calculatePerimeter() {
		System.out.println("Circle Perimeter: 43.96");
	}
}
public class Program29_30 {
	public static void main(String[] args) {
		System.out.println("Trainglr Details :");
		Triangle21 t = new Triangle21();
		t.calculateArea();
		t.calculatePerimeter();
		System.out.println("-------------------------");
		System.out.println("Circle Details : ");
		Circle21 c = new Circle21();
		c.calculateArea();
		c.calculatePerimeter();
	}
}
