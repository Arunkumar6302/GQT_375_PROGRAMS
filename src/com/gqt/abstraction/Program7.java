package com.gqt.abstraction;

abstract class BankAccount {
	abstract void deposit();

	abstract void withdraw();
}

class SavingsAccount extends BankAccount {
	void deposit() {
		System.out.println("Deposit in Savings Account");
	}

	void withdraw() {
		System.out.println("Withdraw from Savings Account");
	}
}

class CurrentAccount extends BankAccount {
	void deposit() {
		System.out.println("Deposit in Current Account");
	}

	void withdraw() {
		System.out.println("Withdraw from Current Account");
	}
}

public class Program7 {
	public static void main(String[] args) {

		System.out.println("Saving Account Details : ");
		SavingsAccount s = new SavingsAccount();
		s.deposit();
		s.withdraw();
		System.out.println("------------------------------");
		System.out.println("Current Account Details : ");
		CurrentAccount c = new CurrentAccount();
		c.deposit();
		c.withdraw();
	}
}
