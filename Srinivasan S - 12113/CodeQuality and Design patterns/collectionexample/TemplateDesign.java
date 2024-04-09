package com.code.collectionexample;

abstract class PaymentProcess {

	// abstract method
	abstract void validatePayment();

	abstract void transferMoney();

	abstract void updateDatabase();

	// template method

	public void makePayment() {
		validatePayment();
		transferMoney();
		updateDatabase();
	}
}

class CreditCard extends PaymentProcess {

	@Override
	void validatePayment() {
		System.out.println("Validation for credit card");
	}

	@Override
	void transferMoney() {
		System.out.println("Transfer money from your credit card");
	}

	@Override
	void updateDatabase() {
		System.out.println("Update the transaction details of credit card to database");
	}

}

class Upi extends PaymentProcess{

	@Override
	void validatePayment() {
		System.out.println("Validation for upi details");
	}

	@Override
	void transferMoney() {
		System.out.println("Transfer money from your upi");
	}

	@Override
	void updateDatabase() {
		System.out.println("Update the transaction details of upi to database");
	}
	
}

class PaymentFactory{
	
	public PaymentProcess getPaymentMethod(String option) {
		if(option.equals("credit card")) {
			return new CreditCard();
		}
		else if(option.equals("upi")) {
			return new Upi();
		}
		return null;
		
	}
}

public class TemplateDesign {

	public static void main(String[] args) {
		
		PaymentFactory factory=new PaymentFactory();
		
		PaymentProcess payment= factory.getPaymentMethod("credit card");
		
		payment.makePayment();
	}
}
