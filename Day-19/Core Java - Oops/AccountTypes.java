package com.newclass;

import java.util.Scanner;

interface Account {
	
	void calcInterest();
}

class SavingsAccount implements Account{
	
	private int value;
	
	
	public SavingsAccount(int value) {
		
		this.value= value;
	}
	

	@Override
	public void calcInterest() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Select If you want Savings A/c \n1.Monthly Interest \n2.Annual Interest");
		 
		int key = sc.nextInt();
		
		
		
		switch (key) {
		case 1:{
			int i = (int) ((value * 1*9.10)/(12*100));
			
			System.out.println("The monthly interest is :"+i);
			
		}
			
			break;
			
		case 2:{
			int i = (int) ((value *12*9.10)/(12*100));
			
			System.out.println("The Yearly interest is :"+i);
			
		}
			
			break;

		default:
			break;
		}
		
		
	}
	
}

class CurrentAccount implements Account{
	
	private int value;
	
	
	public CurrentAccount(int value) {
		
		this.value = value;
	}

	@Override
	public void calcInterest() {
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Select If you want Current A/c \n1.Monthly Interest \n2.Annual Interest");
		 
		int key = sc.nextInt();
		
		
		
		switch (key) {
		case 1:{
			int i = (int) ((value * 1*9.10)/(12*100));
			
			System.out.println("The monthly interest is :"+i);
			
		}
			
			break;
			
		case 2:{
			int i = (int) ((value *12*9.10)/(12*100));
			
			System.out.println("The Yearly interest is :"+i);
			
		}
			
			break;

		default:
			break;
		}
		
		
		
		
		
	}
	
}

public class AccountTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************Savings A/C****************");
		SavingsAccount s = new SavingsAccount(2000);
		s.calcInterest();
		
		
		System.out.println("*************Current A/C****************");
		
		CurrentAccount c =new CurrentAccount(5000);
		c.calcInterest();
		
		
		

	}

}
