package com.oops.day5;

abstract class BankAccount{
	abstract void deposit();
	abstract void withDraw();
	
}

class SavingAccount extends BankAccount{
	void deposit() {
		System.out.println("Amount deposited from Savings Account");
	}
	
	void withDraw() {
		System.out.println("Amount Withdraw from Savings Account");
		
	}
}

class currentAccount extends BankAccount{
	void deposit() {
		System.out.println("Amount deposited from Current Account");
	}
	
	void withDraw() {
		System.out.println("Amount Withdraw from Current Account");
	}
	
}

public class Bank {

	public static void main(String[] args) {
		BankAccount ba=new SavingAccount();
		BankAccount ba2=new currentAccount();
		ba.deposit();
		ba.withDraw();
		ba2.deposit();
		ba2.withDraw();
	}

}
