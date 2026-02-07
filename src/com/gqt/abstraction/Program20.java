package com.gqt.abstraction;

abstract class Shapee {
	abstract void area();
}

class Circlee extends Shapee {
	void area() {
		System.out.println("Circle Area");
	}
}
class Rectanglee extends Shapee {
	void area() {
		System.out.println("Rectangle Area");
	}
}
public class Program20 {
	public static void main(String[] args) {
		System.out.println("Circle Details : ");
		Circlee s = new Circlee();
		s.area();
		System.out.println("------------------------");
		System.out.println("Recatangle Details : ");
		Rectanglee t = new Rectanglee();
		t.area();
	}
}
