package com.coreDay5;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		//Account, SavingAccount,CurrentAccount, RD
		
		Scanner sc = new Scanner(System.in);
		SavingsAccount2 s = new SavingsAccount2();
		CurrentAccount2 c = new CurrentAccount2();
		
		System.out.println("Choose the Account : \n1.Savings Account "
				+ "\n2.Current Account");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
		
		System.out.println("Enter the Balance Amount : ");
		double balance = sc.nextFloat();
		
		System.out.println("Enter the Number of Year you are gonna Deposit : ");
		
		double time = sc.nextDouble();
		
		
		s.interest(balance, time);
		s.calculate();
		}
		
		if(choice >2) {
			System.out.println("Enter the Correct Number");
		}
		
		if(choice == 2) {
		
			System.out.println("Enter the Balance Amount : ");
			double balance1 = sc.nextFloat();
			
			System.out.println("Enter the Number of Year you are gonna Deposit : ");
			
			double time1 = sc.nextDouble();
			
			System.out.println("How many a year Interest want to be calculated");
			
			int count = sc.nextInt();
		
		c.interest(balance1, time1, count);
		c.calculate();
		}
	}

}

interface Accounts{
	
	abstract void interest(double balance, double time);
	abstract void calculate();
}

class SavingsAccount2 implements Accounts{
	
	double balance;
	double spanb;
	
	public void interest(double balance, double time) {
		
		spanb = balance * 0.03 * time;
		System.out.println("The Interest for the amount " + balance + " for the time "
				 + time + " years is " + spanb);
		
		System.out.println("The Final Amount will be " + balance+spanb);
	}
	
	public void calculate() {
		
	}
}

class CurrentAccount2 implements Accounts{

	float balance;
	float spanb;
	
	public void interest(double balance, double time, int count) {
	
		float spanb = (float) (balance * Math.pow(1 + (0.03 / count), count * time));
		System.out.println(spanb);
	}
	
	public void calculate() {
	}
}

