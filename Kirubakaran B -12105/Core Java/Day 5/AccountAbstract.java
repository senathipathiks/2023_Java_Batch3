package day2oops;

abstract class Account{
	abstract void interest();
	int time=12;
    double priceAmount=1200;
}
class SavingsAccount extends Account{
    
     double rateIntrest=8.2;
	
	void interest() {
		
		double intr=priceAmount*rateIntrest*time;
		System.out.println("Intrest for SavingsAccount :"+intr);
	}
	
}
class CurrentAccount extends Account{
    
	  double rateIntrest=10.0;
	@Override
	void interest() {
		// TODO Auto-generated method stub
		double intr1=priceAmount *rateIntrest/time;
		System.out.println("CurrentAccount :"+intr1);
		
	}
	
}
class RD extends Account{
    
	  double rateIntrest=8.2;
	@Override
	void interest() {
		// TODO Auto-generated method stub
		double intr11=priceAmount *time;
		System.out.println("RD :"+intr11);
		
	}
	
}
public class AccountAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s=new SavingsAccount();
		s.interest();
		CurrentAccount c=new CurrentAccount();
		c.interest();
		RD r=new RD();
		r.interest();
		

	}

}
