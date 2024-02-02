package com.day11;

abstract class BankAccount{
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount{
	public SavingAccount() {
		System.out.println("This is Saving Account ");
	}
	void deposit(double amount) {
		System.out.println("Amount Credited Successfully : "+amount+"Rs");
	}
	void withdraw(double amount) {
		System.out.println("Amount Withdrawed : "+amount+"Rs");
	}
}

class CurrentAccount extends BankAccount{
	public CurrentAccount() {
		System.out.println("This is Current Account ");
	}
	void deposit(double amount) {
		System.out.println("Amount Credited Successfully : "+amount+"Rs");
	}
	void withdraw(double amount) {
		System.out.println("Amount Withdrawed : "+amount+"Rs");
	}
}

public class AbstractBankAccountClass {

	public static void main(String[] args) {
		BankAccount obj = new SavingAccount();
		obj.deposit(6080.86);
		obj.withdraw(3000);
		System.out.println("--------------------------------------");
		BankAccount obj1 = new CurrentAccount();
		obj1.deposit(14899.99);
		obj1.withdraw(6000);
		System.out.println("--------------------------------------");
	}

}
