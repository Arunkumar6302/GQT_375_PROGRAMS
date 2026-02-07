package com.gqt.encapsulations;

class Student11 {
	private String name;
	private int roll;
	private int marks;

	public void setData(String name, int roll, int marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	public void getData() {
		System.out.println("Name : "+name );
		System.out.println("Roll No :"+roll);
		System.out.println("Marks : "+marks);
	}
}

public class Program9 {
	public static void main(String[] args) {
		Student11 s = new Student11();
		s.setData("Arun", 1, 21);
		s.getData();
	}
}
