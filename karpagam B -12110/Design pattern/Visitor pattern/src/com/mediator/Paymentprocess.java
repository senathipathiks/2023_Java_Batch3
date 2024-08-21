package com.mediator;

abstract class PaymentProcessabst {

	// Template method
	public void makePayment() {
		validatePayment();
		transferMoney();
		updateDatabase();
	}
	// abstract methods
	public abstract void validatePayment();

	public abstract void transferMoney();

	
}

	// CreditCard Payment
	class CreditCardPayment extends PaymentProcessabst {

		@Override
		public void validatePayment() {
			System.out.println("validating through creditcard ..");
		}

		@Override
		public void transferMoney() {
			System.out.println("transfering money using credit card..");
		}

		@Override
		public void updateDatabase() {
			System.out.println("payment will be saved using Credit card ");
		}

	}

	// UPI Transaction
	class UpiTransaction extends PaymentProcessabst {

		@Override
		public void validatePayment() {
			System.out.println("validating through UPI ..");

		}

		@Override
		public void transferMoney() {
			System.out.println("transfering money using UPI Transaction..");

		}

		@Override
		public void updateDatabase() {
			System.out.println("payment will be saved using Upi ");

		}

	}

	class PaymentGatewayFactory {

		public PaymentProcessabst getPaymentMethod(String option) {

			if (option.equals("credit card"))
				return new CreditCardPayment();
			else if (option.equals("UPI"))
				return new UpiTransaction();
			return null;

		}

	}

	// main class
	public class Paymentprocess {
		public static void main(String[] args) {
			
			PaymentGatewayFactory payFactory = new PaymentGatewayFactory();
			
			PaymentProcessabst paymentProcess =payFactory.getPaymentMethod("credit card");
			paymentProcess.makePayment();

		}

	
	
}
