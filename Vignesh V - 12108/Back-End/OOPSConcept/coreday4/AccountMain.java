package com.coreday4;

	abstract class Account{
		double balance;
		public Account(double balance) {
			this.balance = balance;
		}
		abstract void displayBalance();
	}

	class SavingsAccount extends Account{
		
		public SavingsAccount(double balance) {
			super(balance);
		}
		@Override
		void displayBalance() {
			System.out.println("Saving Account Balance : "+(balance=balance+balance*0.08));
		}
	}

	class CurrentsAccount extends Account{
		
		public CurrentsAccount(double balance) {
			super(balance);
		}
		@Override
		void displayBalance() {
			System.out.println("Current Account Balance : "+(balance=balance+balance*0.20));
		}
	}

	class RD extends Account{
		
		public RD(double balance) {
		super(balance);	
		}
		
		@Override
		void displayBalance() {
			System.out.println("RD Balance : "+(balance=balance+balance*0.75));
		}
	}

	public class AccountMain {

		public static void main(String[] args) {
			
			Account acc1 = new SavingsAccount(6000);
			acc1.displayBalance();
			
			Account acc2 = new CurrentsAccount(6000);
			acc2.displayBalance();
			
			Account acc3 = new RD(6000);
			acc3.displayBalance();
		}

	}

