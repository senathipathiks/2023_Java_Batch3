package com.javacoreday5;

abstract class Loan{
	abstract void interest();
	
}
class HousingLoan extends Loan{
	void interest() {
		System.out.println("interest rate is:8.0");
	}
}
class PersonalLoan extends Loan{
	void interest() {
		System.out.println("interest reate is :11.0");
	}
}
class VehicleLoan extends Loan{
	void interest() {
		System.out.println("interest rate is:15.0");
	}
}
public class AbstractLoan {
	public static void main(String[] args) {
		Loan l1 = new HousingLoan();
		l1.interest();
		
		Loan l2 = new PersonalLoan();
		l2.interest();
		
		Loan l3 = new VehicleLoan();
		l3.interest();
	}
}
