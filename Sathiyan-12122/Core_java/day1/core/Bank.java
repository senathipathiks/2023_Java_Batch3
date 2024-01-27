package com.day1.core;

interface Account {
	double calcInterest();
}

class SavingsAccount implements Account {
	private double balance;
	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calcInterest() {
		return balance * interestRate;
	}
}


class CurrentAccount implements Account {
	private double balance;
	private double interestRate;

	public CurrentAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calcInterest() {
		return balance * interestRate;
	}
}


public class Bank {
	public static void main(String[] args) {
	     Account savings = new SavingsAccount(1000, 0.05);
	     System.out.println("Savings Account Interest: " + savings.calcInterest());
	
	     Account current = new CurrentAccount(1000, 0.02);
	     System.out.println("Current Account Interest: " + current.calcInterest());
 }
}
