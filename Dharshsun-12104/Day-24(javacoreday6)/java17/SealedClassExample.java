package com.javacoreday6;

abstract sealed class Account permits SavingsAccount,CurrentAccount{

	double balance;
	double interest;
	public Account(double balance,double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	abstract void calInterest();
	
}

final class SavingsAccount extends Account{
	final static double interest = 0.25;
	double balance ;
	
	public SavingsAccount(double balance) {
		
		super(balance,interest);
		this.balance = balance;
	}
	
	@Override
	void calInterest() {
		System.out.println("Available Balance : "+(balance+=(balance*interest)));
	}
}

final class CurrentAccount extends Account{
	final static double interest = 0.75;
	double balance ;
	
	public CurrentAccount(double balance) {
		
		super(balance,interest);
		this.balance = balance;
	}
	

	@Override
	void calInterest() {
		System.out.println("Available Balance : "+(balance+=(balance*interest)));
	}
	
}

public class SealedClassExample {

	public static void main(String[] args) {
		Account obj = new SavingsAccount(13500);
		System.out.print("Savings Account - ");
		obj.calInterest();
		
		Account obj1 = new CurrentAccount(13500);
		System.out.print("Current Account - ");
		obj1.calInterest();
	}

}
