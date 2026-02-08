package com.gqt.abstraction;

abstract class Vehicle2 {
	abstract void drive();
	abstract void stop();
}
class Carr extends Vehicle2 {
	void drive() {
		System.out.println("Car is driving");
	}
	void stop() {
		System.out.println("Car stopped");
	}
}
class Truck extends Vehicle2 {
	void drive() {
		System.out.println("Truck is driving");
	}
	void stop() {
		System.out.println("Truck stopped");
	}
}

public class Program17_18 {
	public static void main(String[] args) {
		System.out.println("Car Details : ");
		Carr c = new Carr();
		c.drive();
		c.stop();
		System.out.println("-----------------------");
		System.out.println("Truck Details :");
		Truck t = new Truck();
		t.drive();
		t.stop();
	}
}
