package com.coreday4;

abstract class Loan {

	abstract void interest();

}

class HousingLoan extends Loan {

	void interest() {
		System.out.println("Interest rate is: 8.0");
	}

}

class PersonalLoan {
	void interest() {
		System.out.println("Interest rate is: 11.0");
	}

}

class VehicleLoan extends Loan {
	void interest() {
		System.out.println("Interest rate is: 15.0");
	}
}

public class AbstractExamples1 {

	public static void main(String[] args) {

		VehicleLoan obj1 = new VehicleLoan();
		obj1.interest();

		PersonalLoan obj2 = new PersonalLoan();
		obj2.interest();

		VehicleLoan obj3 = new VehicleLoan();
		obj3.interest();

	}

}
