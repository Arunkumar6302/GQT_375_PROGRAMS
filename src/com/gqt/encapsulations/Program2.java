package com.gqt.encapsulations;

class Student1 {
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

public class Program2 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setData("Arun", 1, 21);
		s.getData();
	}
}
