package rel.oops.day5.abstraction;

abstract class Payment {

	double amt;
	String payType;
	double tax;

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	abstract double amtPayable();

}

class UpiPayment extends Payment {
	
	public UpiPayment(double am) {
		super.setAmt(am);
		super.setPayType("UPI");
		super.setTax(4.00);
	}

	@Override
	double amtPayable() {

		return amt+tax;
	}

}

class BankTransaction extends Payment {
	
	public BankTransaction(double am) {
		super.setAmt(am);
		super.setPayType("UPI");
		super.setTax(2.00);
	}

	@Override
	double amtPayable() {
		return amt+tax;
	}

}

public class PaymentDriver {

}
