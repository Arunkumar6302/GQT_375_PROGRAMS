package com.gqt.operators;

public class Program8 {
	public static void main(String[] args) {
        double p = 1000, r = 10, t = 2;
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest : "+ci);
    }
}
