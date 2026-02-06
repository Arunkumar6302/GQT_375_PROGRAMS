package com.gqt.overloading;

class Prime {
	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isPrime(long n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Program10 {
	public static void main(String[] args) {

		Prime p = new Prime();
		System.out.println("Given number is prime or not  using  method overloading : ");
		boolean res1 = p.isPrime(6);
		System.out.println(res1);
		System.out.println("--------------------");
		boolean res2 = p.isPrime(27);
		System.out.println(res2);
	}
}
