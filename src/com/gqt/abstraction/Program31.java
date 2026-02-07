package com.gqt.abstraction;

abstract class BankAccounttt1 {
	abstract void deposit();

	abstract void withdraw();
}

class SavingsAccounttt1 extends BankAccounttt1 {
	void deposit() {
		System.out.println("Deposit in Savings Account");
	}

	void withdraw() {
		System.out.println("Withdraw from Savings Account");
	}
}

class CurrentAccounttt1 extends BankAccounttt1 {
	void deposit() {
		System.out.println("Deposit in Current Account");
	}

	void withdraw() {
		System.out.println("Withdraw from Current Account");
	}
}

public class Program31 {
	public static void main(String[] args) {
		System.out.println("Saving Account Details : ");
		SavingsAccounttt1 s = new SavingsAccounttt1();
		s.deposit();
		s.withdraw();
		System.out.println("-----------------------------");
		System.out.println("Current Account Details : ");
		CurrentAccounttt1 c = new CurrentAccounttt1();
		c.deposit();
		c.withdraw();
	}
}
