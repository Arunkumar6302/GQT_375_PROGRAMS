package com.gqt.abstraction;

abstract class Animal1 {
	abstract void eat();
	abstract void sleep();
}
class Dog1 extends Animal1 {
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog sleeps at night");
	}
}
class Cat1 extends Animal1 {
	void eat() {
		System.out.println("Cat is eating");
	}
	void sleep() {
		System.out.println("Cat sleeps during day");
	}
}
public class Program4 {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.eat();
		d.sleep();
		System.out.println("-----------------------");
		Cat1 c = new Cat1();
		c.eat();
		c.sleep();
	}
}
