package com.gqt.introduction;

import java.util.*;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Radius : ");
		double r = sc.nextDouble();
		double area = Math.PI * r * r;
		double parameter = 2 * Math.PI * r;
		System.out.println("Area of the circle : " + area);
		System.out.println("Parameter of the circle :" + parameter);
	}
}
