package com.day5.core;

abstract class Loan{
	abstract void interest();
}

class HousingLoan extends Loan{
	void interest() {
		System.out.println("Interest rate is 11.0%");
	}
}

class VehicleLoan extends Loan{
	void interest() {
		System.out.println("Interest rate is 8.0%");
	}
}

class PersonalLoan extends Loan{
	void interest() {
		System.out.println("Interest rate is 15.0%");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Loan pref=new PersonalLoan();
		Loan href=new HousingLoan();
		Loan vref=new VehicleLoan();
		pref.interest();
		href.interest();
		vref.interest();
		

	}

}
