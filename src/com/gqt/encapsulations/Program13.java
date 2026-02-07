package com.gqt.encapsulations;

class Employee {
	private String name;
	private int id;
	private int salary;

	public void setData(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void getData() {
		System.out.println("Employee Name : "+name );
		System.out.println("Employee Id No :"+id);
		System.out.println("Employee Salary : "+salary);
	}
}

public class Program13 {
	public static void main(String[] args) {
		Employee s = new Employee();
		s.setData("Arun", 11, 21000);
		s.getData();
	}
}
