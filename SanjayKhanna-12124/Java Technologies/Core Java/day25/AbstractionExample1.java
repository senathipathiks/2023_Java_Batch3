package com.day25;

abstract class Loan{
	abstract void interest();
}

class HousingLoan extends Loan{
	
	public HousingLoan() {
		System.out.println("This is Housing Loan Class");
	}

	@Override
	void interest() {
		System.out.println("Interest Rate : 8.0");
	}
	
}

class PersonalLoan extends Loan{
	
	public PersonalLoan() {
		System.out.println("This is Personal Loan Class");
	}
	@Override
	void interest() {
		System.out.println("Interest Rate : 11.0");
	}
}

class VehicalLoan extends Loan{
	
	public VehicalLoan() {
		System.out.println("This is Vehical Loan Class");
	}	
	 @Override
	void interest() {
		 System.out.println("Interest Rate : 15.0");
	}
}

public class AbstractionExample1 {

	public static void main(String[] args) {
		
		Loan house = new HousingLoan();
		house.interest();
		
		Loan personal = new PersonalLoan();
		personal.interest();
		
		Loan vehical = new VehicalLoan();
		vehical.interest();

	}

}
