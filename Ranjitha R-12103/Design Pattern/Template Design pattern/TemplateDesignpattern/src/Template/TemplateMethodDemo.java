package Template;

abstract class PaymentProcess {

	// Template Method
	public void makePayment() {
		validatePayment();
		transferMoney();
		updateDatabase();
	}

	// Abstract Class
	public abstract void validatePayment();

	public abstract void transferMoney();

	public abstract void updateDatabase();
}

class CreditCardPayment extends PaymentProcess {

	@Override
	public void validatePayment() {
		System.out.println("Validating through credicted method");

	}

	@Override
	public void transferMoney() {
		System.out.println("Transfering money using creditcard method");

	}

	@Override
	public void updateDatabase() {
		System.out.println("Updating database as paymenyt using creditcard");

	}

}

class UPITransaction extends PaymentProcess {

	@Override
	public void validatePayment() {
		System.out.println("Validating through UPI method");

	}

	@Override
	public void transferMoney() {
		System.out.println("Transfering money using UPI method");

	}

	@Override
	public void updateDatabase() {
		System.out.println("Updating database as paymenyt using UPI");

	}
}

class PaymentGatewayFactory {
	public PaymentProcess getPaymentMethod(String option) {
		if (option.equals("Credit Card"))
			return new CreditCardPayment();
		else if (option.equals("UPI"))
			return new UPITransaction();

		return null;
	}
}

//Main Class
public class TemplateMethodDemo {

	public static void main(String[] args) {

		PaymentGatewayFactory factory = new PaymentGatewayFactory();
		PaymentProcess payment = factory.getPaymentMethod("Credit Card");
		payment.makePayment();
		
		System.out.println("----------------------------------------------------");
		
		PaymentProcess paymentProcess =factory.getPaymentMethod("UPI");
		paymentProcess.makePayment();
		
	}
}
