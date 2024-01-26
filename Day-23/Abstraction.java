package com.Day5;

abstract class Loan{
	abstract void interest();
}


class HousingLoan extends Loan{

	@Override
	void interest() {
		
		System.out.println("The Interest Rate is : 8.0");
	}
	
}


class PersonalLoan extends Loan{

	@Override
	void interest() {
		
		System.out.println("The Personal Loan Ineterst Rate is : 11.0");
		
	}
	
}

class VechicleLoan extends Loan{

	@Override
	void interest() {
		System.out.println("The Vechicle Loan Ineterst Rate is : 15.0");
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		
		Loan h = new HousingLoan();
		
		Loan P= new PersonalLoan();
		
		Loan V = new VechicleLoan();
		
		h.interest();
		P.interest();
		V.interest();
		
	}

}
