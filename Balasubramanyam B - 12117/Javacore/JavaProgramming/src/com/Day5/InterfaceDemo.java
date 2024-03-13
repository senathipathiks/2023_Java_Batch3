package com.Day5;
interface Loan1{
	void interest();
}
class HouseLoan1 implements Loan1{

	@Override
	public void interest() {
		System.out.println("Interest of rate is: 8.0");
	}
	
}
class PersonalLoan1 implements Loan1{

	@Override
	public void interest() {
		System.out.println("Interest of rate is: 10.0");
	}
	
}
class VehicleLoan1 implements Loan1{

	@Override
	public void interest() {
		System.out.println("Interest of rate is: 12.0");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Loan1 l = new HouseLoan1();
		l.interest();
		Loan1 l1 = new PersonalLoan1();
		l1.interest();
		Loan1 l2 = new VehicleLoan1();
		l2.interest();

	}

}
