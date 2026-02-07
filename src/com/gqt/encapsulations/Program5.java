package com.gqt.encapsulations;

class Car {
	private String model;
	private String color;
	private int price;

	public void setCar(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public void show() {
		System.out.println("Car Model: "+model );
		System.out.println("Car Color: "+color );
		System.out.println("Car Price: "+price );
	}
}

public class Program5 {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCar("Swift", "Red", 700000);
		c.show();
		System.out.println("_______________________");
		c.setCar("Maruthi", "black", 900000);
		c.show();
		
	}
}
