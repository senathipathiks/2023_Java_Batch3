package com.day5;
interface Loan1{
	 void interest1();
}
class HousingLoan1 implements Loan1
{
	public void interest1()
	{
		System.out.println("Interest Rate is: 8.0");
	}
}
class PersonalLoan1 implements Loan1
{
	public void interest1()
	{
		System.out.println("Interest rate is:11.0");
	}
}
class VehicleLoan1 implements Loan1
{
	public void interest1()
	{
		System.out.println("Interest rate is: 2.0");
	}
}

public class InterfaceEgLoan {

	public static void main(String[] args) {
		VehicleLoan1 obj2=new VehicleLoan1();
		obj2.interest1();

	}

}
