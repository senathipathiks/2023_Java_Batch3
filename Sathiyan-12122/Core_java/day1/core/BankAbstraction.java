package com.day1.core;

abstract class Banks{
	abstract double calcInterest();
}

class SavingsAccounts extends Banks{
	private double balance;
	private double intrest;
	
	

	public SavingsAccounts(double balance, double intrest) {
		this.balance = balance;
		this.intrest = intrest;
	}



	@Override
	double calcInterest() {
		return balance + intrest;
	}
}

class CurrentAccounts extends Banks{
	private double balance;
	private double intrest;
	
	public CurrentAccounts(double balance, double intrest) {
		this.balance = balance;
		this.intrest = intrest;
	}
	
	@Override
	double calcInterest() {
		return balance + intrest;
	}
}

public class BankAbstraction {

	public static void main(String[] args) {
		SavingsAccounts ref=new SavingsAccounts(14000, 50);
		System.out.println("Savings Account details : "+ref.calcInterest());

		CurrentAccounts ref2=new CurrentAccounts(16000, 60);
		System.out.println("Current Account details : "+ref2.calcInterest());
	}

}
