package com.gqt.overloading;

class AvgArray {
    static int avg(int[] a) {
        int s = 0;
        for (int i : a) s += i;
        return s / a.length;
    }
    static double avg(double[] a) {
        double s = 0;
        for (double i : a) s += i;
        return s / a.length;
    }
}

public class Program17 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		AvgArray a1 = new AvgArray();
		System.out.println("Average of Array elements using  method overloading : ");
		int res1 = a1.avg(a);
		System.out.println(res1);
		System.out.println("--------------------");
		double res2 = a1.avg(a);
		System.out.println(res2);
	}
}
