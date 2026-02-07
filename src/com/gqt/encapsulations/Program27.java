package com.gqt.encapsulations;

class Student12 {
	private String name;
	private int roll;
	private int age;

	public void setData(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}

	public void getData() {
		System.out.println("Name : "+name );
		System.out.println("Roll No :"+roll);
		System.out.println("Age : "+age);
	}
}

public class Program27 {
	public static void main(String[] args) {
		Student12 s = new Student12();
		s.setData("Arun", 1, 21);
		s.getData();
	}
}
