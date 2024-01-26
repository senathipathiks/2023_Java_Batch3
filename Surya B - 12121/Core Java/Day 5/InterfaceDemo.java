package com.coreDay5;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		HousingLoan1 h = new HousingLoan1();
		PersonalLoan1 p = new PersonalLoan1();
		VehicleLoan1 v = new VehicleLoan1();
		
		h.intrest();
		p.intrest();
		v.intrest();
	}

}

interface Loan1 {
	abstract void intrest();
}

class HousingLoan1 implements Loan1{
	public void intrest() {
		System.out.println("Interest Rate is 8%");
	}
}

class PersonalLoan1 implements Loan1{
	public void intrest() {
		System.out.println("Interest Rate is 11%");
	}
}
class VehicleLoan1 implements Loan1{
	public void intrest() {
		System.out.println("Interest Rate is 15%");
	}
}
