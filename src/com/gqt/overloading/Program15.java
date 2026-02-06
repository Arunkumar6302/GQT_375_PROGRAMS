package com.gqt.overloading;

class Temp {
    static double convert(double c) {
        return (c * 9 / 5) + 32;
    }
    static double convert(int f, boolean x) {
        return (f - 32) * 5 / 9;
    }
}

public class Program15 {
	public static void main(String[] args) {

		Temp t = new Temp();
		System.out.println("Converting temp from celcius to FahHeat using  method overloading : ");
		double res1 = t.convert(4);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = t.convert(9,true);
		System.out.println(res2);
	}
}
