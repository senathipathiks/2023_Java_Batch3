package com.day5;
abstract class Loan{
	abstract void interest();
}
class HousingLoan extends Loan
{
	void interest()
	{
		System.out.println("Interest Rate is: 8.0");
	}
}
class PersonalLoan extends Loan
{
	void interest()
	{
		System.out.println("Interest rate is:11.0");
	}
}
class VehicleLoan extends Loan
{
	void interest()
	{
		System.out.println("Interest rate is: 2.0");
	}
}
public class LoanEgAbstraction {

	public static void main(String[] args) {
	HousingLoan obj=new HousingLoan();
	obj.interest();
	PersonalLoan obj1=new PersonalLoan();
	obj1.interest();
	VehicleLoan obj2=new VehicleLoan();
	obj2.interest();
	}

}
