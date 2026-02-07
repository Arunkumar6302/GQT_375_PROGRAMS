package com.gqt.abstraction;

abstract class Vehicle3 {
	abstract void start();

	abstract void stop();
}

class Car3 extends Vehicle3 {
	void start() {
		System.out.println("Car started");
	}

	void stop() {
		System.out.println("Car stopped");
	}
}

class Motorcycle3 extends Vehicle3 {
	void start() {
		System.out.println("Motorcycle started");
	}

	void stop() {
		System.out.println("Motorcycle stopped");
	}
}

public class Program27 {
	public static void main(String[] args) {
		System.out.println("Car Details : ");
		Car3 c = new Car3();
		c.start();
		c.stop();
		System.out.println("-------------------");
		System.out.println("Motorcycle Details : ");
		Motorcycle3 m = new Motorcycle3();
		m.start();
		m.stop();
	}
}
