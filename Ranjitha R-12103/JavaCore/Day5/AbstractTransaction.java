//Payment, UPITransaction, BankTransaction
package Day5;

abstract class Payment {
	double amount;

	void read_payment(double amount) {
		this.amount = amount;
	}

	abstract void transaction();
}

class UPITransaction extends Payment {
	String TransactionType;

	void read_UPI(double amount, String TransactionType) {
		this.TransactionType = TransactionType;
		super.read_payment(amount);
	}

	@Override
	void transaction() {
		System.out.println("The amount " + amount + " is transferred using " + TransactionType + " method.");

	}

}

class BankTransaction extends Payment {
	String TransactionType;

	void read_Bank(double amount, String TransactionType) {
		this.TransactionType = TransactionType;
		super.read_payment(amount);
	}

	@Override
	void transaction() {
		System.out.println("The amount " + amount + " is transferred using " + TransactionType + " method.");

	}

}

public class AbstractTransaction {

	public static void main(String[] args) {
		UPITransaction obj1 = new UPITransaction();
		obj1.read_UPI(2000, "UPI Payment");
		obj1.transaction();

		BankTransaction obj2 = new BankTransaction();
		obj2.read_Bank(4000, "Bank Transaction");
		obj2.transaction();

	}

}
