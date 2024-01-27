package Day_5;
//Payment, UPITransaction, BankTransaction

abstract class Payment{
	int upiId;
	String acName;
	long acno;
	
	public Payment(int upiId, String acName,long acno) {
		super();
		this.upiId = upiId;
		this.acName = acName;
		this.acno=acno;
	}

	abstract void mode();
}

class UpiTransaction extends Payment{

	public UpiTransaction(int upiId, String acName, long acno) {
		super(upiId, acName, acno);
		
	}

	@Override
	void mode() {
		System.err.println("UPI id : "+upiId);
		System.out.println("Account holder name : "+acName);
		
	}
	
}

class BankTransaction extends Payment{

	public BankTransaction(int upiId, String acName,long acno) {
		super(upiId, acName, acno);
		
	}

	@Override
	void mode() {
		System.err.println("Account number : "+acno);
		System.out.println("Account holder name : "+acName);	
		
	}
	
}

public class ModeOfPayment {

	public static void main(String[] args) {
		UpiTransaction upi=new UpiTransaction(1, "Sri",78334411);
		upi.mode();
		
		BankTransaction bank=new BankTransaction(78334411, "Sri", 1);
		bank.mode();
		
	}
}

