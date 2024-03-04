package com.javacoreday5;

 interface Loan1{
	 void interest();
	
}
class HousingLoan1 implements Loan1{
	public void interest() {
		System.out.println("interest rate is:8.0");
	}
}
class PersonalLoan1 implements Loan1{
	public void interest() {
		System.out.println("interest reate is :11.0");
	}
}
class VehicleLoan1 implements Loan1{
	public void interest() {
		System.out.println("interest rate is:15.0");
	}
}
public class InterfaceLoan {
	public static void main(String[] args) {
		Loan1 l1 = new VehicleLoan1();
		l1.interest();
		
		Loan1 l2 = new PersonalLoan1();
		l2.interest();
		
		Loan1 l3 = new HousingLoan1();
		l3.interest();
	}
}

