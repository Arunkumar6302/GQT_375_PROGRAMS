package com.gqt.abstraction;

abstract class Animal {
	abstract void eat();
	abstract void sleep();
}
class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog sleeps at night");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating");
	}
	void sleep() {
		System.out.println("Cat sleeps during day");
	}
}

public class Program3 {
	public static void main(String[] args) {
		System.out.println("Dog Details : ");
		Dog d = new Dog();
		d.eat();
		d.sleep();
		System.out.println("-----------------------");
		System.out.println("Cat Details: ");
		Cat c = new Cat();
		c.eat();
		c.sleep();
	}
}
