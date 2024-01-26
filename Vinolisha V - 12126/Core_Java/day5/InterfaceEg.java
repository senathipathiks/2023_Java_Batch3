package com.day5;

interface Loans{
	void interest();
	
}

class HousingLoans implements Loans{
	public void interest() {
		System.out.println("Interest Rate is :8.0");
	}
}
class PersonalLoans implements Loans{
	public void interest() {
		System.out.println("Interest Rate is: 11.0");
	}
}

class VehicleLoans implements Loans{
	public void intereset() {
		System.out.println("Interest Rate is:15.0");
	}

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceEg {

	public static void main(String[] args) {
		VehicleLoans obj1=new VehicleLoans();
		obj1.interest();
		
		PersonalLoans obj2=new PersonalLoans();
		obj2.interest();
		
		HousingLoans obj3=new HousingLoans();
		obj3.interest();
		
	}

}
