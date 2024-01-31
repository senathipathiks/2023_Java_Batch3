package com.day1;

public class Salary {
	interface Account {
	    void calcInterest();
	}

	class SavingsAccount implements Account {
	    private double balance;
	    private double interestRate;

	    public SavingsAccount(double balance, double interestRate) {
	        this.balance = balance;
	        this.interestRate = interestRate;
	    }

	    public void calcInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest added: $" + interest);
	    }

	    public void showBalance() {
	        System.out.println("Balance: $" + balance);
	    }
	}

	class CurrentAccount implements Account {
	    private double balance;
	    private double interestRate;

	    public CurrentAccount(double balance, double interestRate) {
	        this.balance = balance;
	        this.interestRate = interestRate;
	    }

	    public void calcInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest added: $" + interest);
	    }

	    public void showBalance() {
	        System.out.println("Balance: $" + balance);
	    }
	}

}
