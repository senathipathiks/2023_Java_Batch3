package com.day5;

abstract class Loan{
	abstract void interest();
}

class HousingLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is:8.0");
		
	}
}

class PersonalLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is:11.0");
	}
}

class VehicleLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is:15.0");
	}
}
public class AbstractClassMethodEg {

	public static void main(String[] args) {
		VehicleLoan obj1=new VehicleLoan();
		obj1.interest();
		
		PersonalLoan obj2=new PersonalLoan();
		obj2.interest();
		
		HousingLoan obj3=new HousingLoan();
		obj3.interest();

	}

}
