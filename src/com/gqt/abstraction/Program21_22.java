package com.gqt.abstraction;

abstract class Animall {
	abstract void eat();
	abstract void sleep();
}
class Dogg extends Animall {
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog sleeps at night");
	}
}

class Catt extends Animall {
	void eat() {
		System.out.println("Cat is eating");
	}
	void sleep() {
		System.out.println("Cat sleeps during day");
	}
}

public class Program21_22 {
	public static void main(String[] args) {
		System.out.println("Dog Details : ");
		Dogg d = new Dogg();
		d.eat();
		d.sleep();
		System.out.println("-----------------------");
		System.out.println("Cat Details: ");
		Catt c = new Catt();
		c.eat();
		c.sleep();
	}
}

