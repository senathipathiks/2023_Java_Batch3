package com.coreday4;

interface Loan1 {

	void interest();

}

class HousingLoan1 implements Loan1 {

	public void interest() {
		System.out.println("Interest rate is: 8.0");
	}

}

class PersonalLoan1 implements Loan1 {
	public void interest() {
		System.out.println("Interest rate is: 11.0");
	}

}

class VehicleLoan1 implements Loan1 {
	public void interest() {
		System.out.println("Interest rate is: 15.0");
	}
}

public class Interface {

	public static void main(String[] args) {

		VehicleLoan1 obj1 = new VehicleLoan1();
		obj1.interest();

		PersonalLoan1 obj2 = new PersonalLoan1();
		obj2.interest();

	}

}
