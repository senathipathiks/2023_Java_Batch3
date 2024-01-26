package com.day25;

interface Loan1{
	void calInterest();
}

class Housing implements Loan1{
	
	@Override
	public void calInterest() {
		System.out.println("Housing Loan : 10%");
	}
}

class Personal implements Loan1{

	@Override
	public void calInterest() {
		System.out.println("Personal Loan : 15%");
	}
}

class Vehical implements Loan1{

	@Override
	public void calInterest() {
		System.out.println("Vehical Loan : 18%");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		Loan1 house = new Housing();
		house.calInterest();
		
		Loan1 personal = new Personal();
		personal.calInterest();
		
		Loan1 vehical = new Vehical();
		vehical.calInterest();


	}

}
