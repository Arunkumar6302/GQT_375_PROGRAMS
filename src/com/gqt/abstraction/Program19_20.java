package com.gqt.abstraction;

abstract class BankAccounttt {
	abstract void deposit();

	abstract void withdraw();
}

class SavingsAccounttt extends BankAccounttt {
	void deposit() {
		System.out.println("Deposit in Savings Account");
	}

	void withdraw() {
		System.out.println("Withdraw from Savings Account");
	}
}

class CurrentAccounttt extends BankAccounttt {
	void deposit() {
		System.out.println("Deposit in Current Account");
	}

	void withdraw() {
		System.out.println("Withdraw from Current Account");
	}
}

public class Program19_20 {
	public static void main(String[] args) {
		System.out.println("Saving Account Details : ");
		SavingsAccounttt s = new SavingsAccounttt();
		s.deposit();
		s.withdraw();
		System.out.println("-----------------------------");
		System.out.println("Current Account Details : ");
		CurrentAccounttt c = new CurrentAccounttt();
		c.deposit();
		c.withdraw();
	}
}
