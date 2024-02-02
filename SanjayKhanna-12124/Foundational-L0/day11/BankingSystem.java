package com.day11;

import java.util.ArrayList;
import java.util.List;

interface Accounts{																							//Usage of Interface
	void deposit(double amount);
	void withdraw(double amount);
	double calInterest();
	double veiwBalance();
}

class SavingsAccount implements Accounts{																	//Savings Account Class
	
	double balance;
	final double interest = 6.75;
	
	public SavingsAccount(double balance) {
		System.out.println("New Savings Account Created Successfully.....!");
		this.balance=balance;		
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
		
	}
	public double calInterest() {
		return balance*interest/100;
	}
	public double veiwBalance() {
		return balance;
	}
	
}

class CurrentAccounts implements Accounts{																//Current Account class
	
	double balance;
	final double interest = 9.75;
	
	public CurrentAccounts(double balance) {
		System.out.println("New Current Account Created Successfully.....!");
		this.balance=balance;		
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
		
	}
	public double calInterest() {
		return balance*interest/100;
	}
	public double veiwBalance() {
		return balance;
	}
	
}

class Bank {
	

	private List<Object> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();																	//Using Data Structure ArrayList
	}
	
	public void addAccount(Accounts account) {
		accounts.add(account);
	}
	
	public void removeAccount(Accounts account) {
		accounts.remove(account);
	}
	
	 public void deposit(Accounts account, double amount) {
	        account.deposit(amount);
	        System.out.println("Amount Credited : "+amount+"Rs");
	    }
	 public void withdraw(Accounts account, double amount) {
	        account.withdraw(amount);
	        System.out.println("Amount Withdrawed :"+amount+"Rs");
	    }
	 
	 public void veiwBalance(Accounts account) {
		 System.out.println("Account Balance : "+account.veiwBalance()+"Rs");
	 }
	 
	 public void calInterest(Accounts account) {
		 System.out.println("Interest of Balance Amount (per year) : "+account.calInterest()+"Rs");
	 }
	
}


public class BankingSystem {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		SavingsAccount saving = new SavingsAccount(1000);															//Creation of Savings Account
		System.out.println("Initial Amount : 1000Rs");
		bank.addAccount(saving);
		bank.deposit(saving, 2000);
		bank.withdraw(saving, 500);
		bank.veiwBalance(saving);
		bank.calInterest(saving);
		System.out.println("-------------------------------------------------------");
		CurrentAccounts current = new CurrentAccounts(1000);														//Creation of Current Account
		System.out.println("Initial Amount : 1000Rs");
		bank.addAccount(current);
		bank.deposit(current, 3000);
		bank.withdraw(current, 500);
		bank.veiwBalance(current);
		bank.calInterest(current);
		System.out.println("-------------------------------------------------------");								
		SavingsAccount vino = new SavingsAccount(2000);
		System.out.println("Initial Amount : 2000Rs");
		bank.addAccount(vino);
		bank.deposit(vino, 1000);
		bank.withdraw(vino, 105);
		bank.veiwBalance(vino);
		bank.calInterest(vino);
		System.out.println("-------------------------------------------------------");
		
	}

}
