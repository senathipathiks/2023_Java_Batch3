package com.coreDay5;

public class Abstract {

	public static void main(String[] args) {
		
		HousingLoan h = new HousingLoan();
		PersonalLoan p = new PersonalLoan();
		VehicleLoan v = new VehicleLoan();
		
		h.intrest();
		p.intrest();
		v.intrest();
	}

}

abstract class Loan {
	abstract void intrest();
	
}

class HousingLoan extends Loan{
	void intrest() {
		System.out.println("The Intrest is 8%");
	}
}

class PersonalLoan extends Loan{
	void intrest() {
		System.out.println("The Intrest is 15%");
	}
}

class VehicleLoan extends Loan{
	void intrest() {
		System.out.println("The Intrest is 11%");
	}
}