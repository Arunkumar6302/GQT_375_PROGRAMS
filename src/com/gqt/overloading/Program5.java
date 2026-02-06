package com.gqt.overloading;

class Factorial {
    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
        	fact *= i;
        }
        return fact;
    }
    static long fact(long n) {
        long fact = 1;
        for (long i = 1; i <= n; i++) {
        	fact *= i;
        }
        return fact;
    }
}

public class Program5 {
	public static void main(String[] args) {

		Factorial f = new Factorial();
		System.out.println("Factorial of a given Number using  method overloading : ");
		int res1 = Factorial.fact(5);
		System.out.println(res1);
		System.out.println("--------------------");
		long res2 = Factorial.fact(10);
		System.out.println(res2);
	}
}
