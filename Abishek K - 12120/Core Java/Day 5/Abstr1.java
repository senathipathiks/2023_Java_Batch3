package com.day5;

abstract class Loan{
	abstract void interest();
}
class HousingLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is: 8.0");
	}
}
class PersonalLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is: 11.0");
	}
}
class VehicleLoan extends Loan{
	void interest() {
		System.out.println("Interest Rate is: 15.0");
	}
}
public class Abstr1 {

	public static void main(String[] args) {
		Loan obj = new HousingLoan();
		obj.interest();
		
		Loan obj1 = new PersonalLoan();
		obj1.interest();
		
		Loan obj2 = new VehicleLoan();
		obj2.interest();

	}

}
