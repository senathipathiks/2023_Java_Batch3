package com.day5;

abstract class Loan {
	abstract void interest();
}

class PersonalLoan extends Loan {
	void interest () {
		System.out.println("Personal Loan Rate of interest : 11.0%");
	}
}
class HouseLoan extends Loan {
	void interest() {
		System.out.println("House Loan Rate of interest : 15.0%");
	}
}
class VehicleLoan extends Loan {
	void interest() {
		System.out.println("Vehicle Loan Rate of interest : 17.0%");
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
		Loan loan1 = new PersonalLoan();
		loan1.interest();
		
		Loan loan2 = new VehicleLoan();
		loan2.interest();
		
		Loan loan3 = new HouseLoan();
		loan3.interest();
	}

}
