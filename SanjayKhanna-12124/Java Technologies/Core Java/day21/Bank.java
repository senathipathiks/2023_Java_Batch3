package com.day21;

interface Account {
	public void calInterest();
}

class SavingsAccount implements Account{
	
	private double interest;
	
	public SavingsAccount(double interest) {
		this.interest=interest;
	}
	public void calInterest() {
		System.out.println("Interest : "+interest);
	}
}

class CurrentAccount implements Account{
	
	private double interest;
	
	public CurrentAccount(double interest) {
		this.interest=interest;
	}
	public void calInterest() {
		System.out.println("Interest : "+interest);
	}
}

public class Bank {

	public static void main(String[] args) {
		Account obj1 = new SavingsAccount(1200);
		obj1.calInterest();
		Account obj2 = new CurrentAccount(999);
		obj2.calInterest();

	}

}
