package com.day5;

abstract class Account{
	abstract void  interest();
}
class SavingAccount extends Account{
	int p=2500;
	int n=5;
	float r=5.2f;
	float si=(p*n*r)/100;
	void interest() {
		System.out.println("Simple Interest of the Saving Account is: "+si);
	}
}
class CurrentAccount extends Account{
	int principal=4000;
	float interestRate = 4.0f;
	int compoundFrequency = 5;
	int years = 9;
	
	double amount = principal * Math.pow(1 + (interestRate / 100.0) / compoundFrequency, years * compoundFrequency);
    double compoundInterest = amount - principal;
	void interest() {
		System.out.println("Compund Interest for Current Account is: "+compoundInterest);
	}
}
class Rd extends Account{
	int p=2500;
	int n=5;
	float r=5.2f;
	float si=(p*n*r)/100;
	void interest() {
		System.out.println("Interest for the RD is: "+si);
	}
}
public class Task2 {

	public static void main(String[] args) {
		Account obj = new SavingAccount();
		obj.interest();
		Account obj1 = new CurrentAccount();
		obj1.interest();
		Account obj2 = new Rd();
		obj2.interest();

	}

}
