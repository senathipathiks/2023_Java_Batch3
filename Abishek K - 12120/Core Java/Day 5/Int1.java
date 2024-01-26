package com.day5;
//interface - public,static,final for all the data members in the interface.
// methods in the interface is always abstract and 

interface Loan1{
	void interest();
}

class HousingLoan1 implements Loan1{
	public void interest() {
		System.out.println("Interest Rate is : 8.0");
	}
}
class PersonalLoan1 implements Loan1{
	public void interest() {
		System.out.println("Interest Rate is: 11.0");
	}
}
class VehicleLoan1 implements Loan1{
	public void interest() {
		System.out.println("Interest Rate is: 15.0");
		
	}
}
public class Int1 {

	public static void main(String[] args) {
		Loan1 obj = new HousingLoan1();
		obj.interest();
		Loan1 obj1 = new PersonalLoan1();
		obj1.interest();
		Loan1 obj2 = new VehicleLoan1();
		obj2.interest();

	}

}
