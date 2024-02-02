package com.day5adv;
abstract class Loan
{
	abstract void interest();
}
class HousingLoan extends Loan
{
	void interest()
	{
		System.out.println("interest Rate is : 8.0");
	}
}

class PersonalLoan extends Loan
{
	void interest()
	{
		System.out.println("interest Rate is : 11.0");
	}
}
class VehicleLoan extends Loan
{

	@Override
	void interest() {
		// TODO Auto-generated method stub
		System.out.println("interest rate is 15");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleLoan obj = new VehicleLoan();
		obj.interest();
	}

}
