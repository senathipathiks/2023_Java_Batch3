package com.day5;

interface Accounts{
	
	void accNumber(int accNo);
	void accHolderName(String name);
	void bankName(String bankName);
	
}

class SavingAccount implements Accounts {
	
	int p ;
	int n ;
    int r ;
	private int accNo;
	private String name;
	private String bankName;
	
	
	public  SavingAccount(int accNo, String name, String bankName) {
		this.accNo = accNo;
		this.name = name;
		this.bankName= bankName;
	}
	
	@Override
	public void accNumber(int accNo) {
		this.accNo = accNo;
	}
	public void accHolderName(String name) {
		this.name = name;
	}
	public void bankName(String bankName) {
		this.bankName = bankName;
	}

	void calculateinterest(int p , int n, int r) {
		int simpleInterest = (p*n*r)/100;
		System.out.println("Simple Interest: "+simpleInterest);
	}	
	
	public void display() {
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Holder Name: "+name);
		System.out.println("Bank Name: "+bankName);
	}	
}
class CurrentAccount implements Accounts {
	
	int p ;
	int n ;
    int r ;
	private int accNo;
	private String name;
	private String bankName;
	
	
	public  CurrentAccount(int accNo, String name, String bankName) {
		this.accNo = accNo;
		this.name = name;
		this.bankName= bankName;
	}
	
	@Override
	public void accNumber(int accNo) {
		this.accNo = accNo;
	}
	public void accHolderName(String name) {
		this.name = name;
	}
	public void bankName(String bankName) {
		this.bankName = bankName;
	}

	void calculateinterest(int p , int n, int r) {
		int simpleInterest = (p*n*r)/100;
		System.out.println("Simple Interest: "+simpleInterest);
	}	
	
	public void display() {
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Holder Name: "+name);
		System.out.println("Bank Name: "+bankName);
	}	
}
public class Ass2 {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1782834927, "Sathish", "Indian Bank");
		sa.display();
		sa.calculateinterest(12000, 2, 18);
		
		CurrentAccount ca = new CurrentAccount(367384927, "Pradeep", "Canara Bank");
		sa.display();
	}

}
