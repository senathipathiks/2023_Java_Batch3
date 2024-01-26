package com.Day4;



	interface Loan{
		abstract void interest();
	}


	class HousingLoan implements Loan{

		@Override
		public void interest() {
			
			System.out.println("The Interest Rate is : 8.0");
		}
		
	}


	class PersonalLoan implements Loan{

		@Override
		public void interest() {
			
			System.out.println("The Personal Loan Ineterst Rate is : 11.0");
			
		}
		
	}

	class VechicleLoan implements Loan{

		@Override
		public void interest() {
			System.out.println("The Vechicle Loan Ineterst Rate is : 15.0");
			
		}
		
	}
	public class Interfaces {

		public static void main(String[] args) {
			
			Loan h = new HousingLoan();
			
			Loan P= new PersonalLoan();
			
			Loan V = new VechicleLoan();
			
			h.interest();
			P.interest();
			V.interest();
			
		}
	}

