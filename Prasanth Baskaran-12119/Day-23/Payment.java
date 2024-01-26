package com.Day5;

abstract class Payments{
	
	float charges;
	
	float amt;
	abstract void paymentGateway(float amt);
	
	
	
}

class UpiTransaction extends Payments{

	@Override
	void paymentGateway(float amt) {
		
		
		charges = 5;
		
		float t = charges + amt;
		
		
		
		System.out.println("The Upi payment Total Amount is :" +t +"\n Charges is :"+charges);
		
	}
	
	
	
}

class BankTransaction extends Payments{

	@Override
	void paymentGateway(float amt) {
		
       charges = 2;
		
		float t = charges + amt;
		
		System.out.println("The Bank payment Total Amount is :" +t +"\n Charges is :"+charges);
		
		
	}
	
	
	
}



public class Payment {
	
	

	public static void main(String[] args) {
		
		Payments u = new UpiTransaction();
		
		BankTransaction b = new BankTransaction();
		
		u.paymentGateway(200);
		
		System.out.println("***********************************************");
		
		b.paymentGateway(200);
		
		
		

	}

}
