package day2oops;

abstract class Payment{
	double amount;
	long Account;
	public  void tran(double amount, long account) {	
		this.amount = amount;
		Account = account;
	}
      abstract void transaction();
}
class Upi extends Payment
{   
	String n;
   public void read_upi(double amount, long account,String n) {
	   super.tran(amount,account);
	   this.n=n;
	   System.out.println(amount);
	   System.out.println(account);
	   System.out.println(n);
   }

	void transaction() {
		System.out.println("Transaction done by upi method");
		
	}	
}
class BankTrans extends Payment
{   
	String ccv;
   public void read_trans(double amount, long account,String ccv) {
	  
	   this.ccv=ccv;
	   System.out.println(amount);
	   System.out.println(account);
	   System.out.println(ccv);
   }

	void transaction() {
		System.out.println("Transaction done by BankTransaction method");
		
	}	
}
public class PaymentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTrans b=new BankTrans();
		b.read_trans(1200.0,987654198,"@1234");
		b.transaction();
		Upi u=new Upi();
		u.read_upi(13.500, 98763363, "#121314");
		u.transaction();
		

	}

}
