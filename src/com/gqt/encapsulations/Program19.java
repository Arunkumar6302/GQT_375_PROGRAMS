package com.gqt.encapsulations;

class Computer {
	private String brand;
	private String model;
	private int price;

	public void setData(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void getData() {
		System.out.println("Computer brand : "+brand );
		System.out.println("Computer model  :"+model);
		System.out.println("Computer price : "+price);
	}
}

public class Program19 {
	public static void main(String[] args) {
		Computer s = new Computer();
		s.setData("lenovo", "windows 11 ", 21000);
		s.getData();
	}
}
