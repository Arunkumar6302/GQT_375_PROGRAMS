package com.gqt.abstraction;

abstract class Animall1 {
	abstract void eat();

	abstract void sleep();
}

class Dogg1 extends Animall1 {
	void eat() {
		System.out.println("Dog is eating");
	}

	void sleep() {
		System.out.println("Dog sleeps at night");
	}
}

class Catt1 extends Animall1 {
	void eat() {
		System.out.println("Cat is eating");
	}

	void sleep() {
		System.out.println("Cat sleeps during day");
	}
}

public class Program33 {
	public static void main(String[] args) {
		System.out.println("Dog Details : ");
		Dogg1 d = new Dogg1();
		d.eat();
		d.sleep();
		System.out.println("-----------------------");
		System.out.println("Cat Details: ");
		Catt1 c = new Catt1();
		c.eat();
		c.sleep();
	}
}
