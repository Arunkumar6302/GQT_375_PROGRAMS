package com.gqt.encapsulations;

class Mobile {
	private String brand;
	private String model;
	private int price;

	public void setData(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void getData() {
		System.out.println("Mobile brand : "+brand );
		System.out.println("Mobile model  :"+model);
		System.out.println("Mobile price : "+price);
	}
}

public class Program15 {
	public static void main(String[] args) {
		Mobile s = new Mobile();
		s.setData("Samsung", "F41 ", 21000);
		s.getData();
	}
}
