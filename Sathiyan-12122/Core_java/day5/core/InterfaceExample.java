package com.day5.core;

interface Loans{
	void interest();
}

class HosingLoan implements Loans{
	public void interest() {
		System.out.println("Interest rate is 8.0");
	}
}

class VehicleLoans implements Loans{
	public void interest() {
		System.out.println("Interest rate is 10.0");
	}
}


class PersonalLoans implements Loans{
	public void interest() {
		System.out.println("Interest rate is 15.0");
	}
}



public class InterfaceExample {

	public static void main(String[] args) {

		VehicleLoan ref1=new VehicleLoan();
		ref1.interest();
		
		HosingLoan ref2=new HosingLoan();
		ref2.interest();
		
		PersonalLoan ref3=new PersonalLoan();
		ref3.interest();
	}

}
