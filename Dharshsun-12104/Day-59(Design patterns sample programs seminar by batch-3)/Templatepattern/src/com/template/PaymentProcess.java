package com.template;

abstract class Template {
	
	public void makePayment() {
		validatePayment();
		transferMoney();
		updateDatabase();
	}
	public abstract void validatePayment();
	public abstract void transferMoney();
	public abstract void updateDatabase();
	
	

}
class CreditCardPayment extends Template{
	@Override
	public void transferMoney() {
		System.out.println("Transfer creditcard");
		
	}
	@Override
	public void validatePayment() {
		System.out.println("Validate credit card payment");
		
	}
	@Override
	public void updateDatabase() {
		System.out.println("update credit card payment using database");
		
	}
}

class UPITransaction extends Template{
	@Override
	public void transferMoney() {
		System.out.println("Transfer creditcard");
		
	}
	@Override
	public void validatePayment() {
		System.out.println("Validate credit card payment");
	}
	@Override
	public void updateDatabase() {
		System.out.println("update credit card payment using database");
	}
	


public PaymentProcess getPaymentMethod(String option) {
	if(option.equals("credit card")) 
		return new CreditCardPayment();
	else if(option.equals("UPI payment"))
		return new UPITransaction();
	
	return null;
}
}
//main class 
public class PaymentProcess{
	
	public static void main(String[] args) {
		
		PaymentGatewayFactory paymentGateWayFactory = new PaymentGatewayFactory();
		
		PaymentProcess paymentProcess1 = paymentGateWayFactory
		
		
	}
	
}