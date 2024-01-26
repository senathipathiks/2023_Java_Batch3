package Com.Day5;

abstract class Payment{
	int Amount;
   void	payment(int Amount) {
	   this.Amount=Amount;
   }
	abstract void calculatePayment();
}
class UPItransaction extends Payment {
	int Amount;
	   void	Upipayment(int Amount) {
		   this.Amount=Amount;
	   }
	@Override
	void calculatePayment() {
          System.out.println("Payment through upi :"+(Amount-0.1));
	}
	
}
class BankTransaction extends Payment{
	int Amount;
	   void	Bankpayment(int Amount) {
		   this.Amount=Amount;
	   }
	@Override
	void calculatePayment() {
        System.out.println("Payment through Bank :"+Amount);

	}
	
}

public class PaymentDetails {

	public static void main(String[] args) {
		UPItransaction obj1=new UPItransaction();
		obj1.Upipayment(30000);
		obj1.calculatePayment();
		
		System.out.println("----------------------------------");
		BankTransaction obj2=new  BankTransaction();
		obj2.Bankpayment(30000);
		obj2.calculatePayment();

	}

}
