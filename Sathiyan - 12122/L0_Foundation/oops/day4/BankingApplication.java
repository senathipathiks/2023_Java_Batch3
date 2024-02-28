package com.oops.day4;

interface Account{
	void deposit();
	void withdraw();
	void interest();
	void balance();
	
}

class Saving implements Account{

	double amount=100;
	
	public void deposit() {	
		amount=amount + 200;//200 rupees deposited
		System.out.println("Amount deposited to Savings Account and now your balance is : "+amount);
	}
	
	public void withdraw() {
		amount=amount-50;//50rs Withdraw
		System.out.println("Amount withdrawed rs : 50 and now your balance is "+amount);
	}
	
	public void balance() {
		System.out.println("Account balance is : "+amount);
	}
	
	public void interest() {//10% interest.
		System.out.println("Interest amount for the balance is : " +(amount/10) +"Rs");
	}
	
}

class Current extends Saving{
	
	double amount=100;
	
	public void deposit() {	
		amount=amount + 200;
		System.out.println("Amount deposited to current Account and now your balance is : "+amount);
	}
	
	public void withdraw() {
		amount=amount-50;
		System.out.println("Amount withdrawed rs : 50 and now your balance is "+amount);
	}
	
	public void balance() {
		System.out.println("Account balance is : "+amount);
	}
	
	public void interest() {
		System.out.println("Interest amount for the balance is : " +(amount/10) +"Rs");
	}
	
}

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account s=new Saving();
		s.deposit();
		s.withdraw();
		s.balance();
		
		Account c=new Current();
		c.deposit();
		c.withdraw();
		c.balance();
		c.interest();

	}

}
