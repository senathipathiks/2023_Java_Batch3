package Com.Day5;

abstract class Account{
	int withdrawal;
	int totalAmount;
	 void balance(int totalAmount,int withdrawal ) {
		this.totalAmount=totalAmount;
		this.withdrawal=withdrawal;

	}
	abstract void CompoundInterest();
	abstract void calculateBalance();
    abstract void simpleInterest();
}
class savingsAccount extends Account{
    int p;
    int r;
	int t;
	void savingsAccountbalance(int totalAmount, int withdrawal,int p,int r,int t) {
		super.balance(totalAmount,withdrawal);
		this.p= p;
		this.r= r;
	    this.t=t;
		
	}
	@Override
	void calculateBalance() {
        System.out.println("Current balance in your SavingsAccount is:"+(totalAmount-withdrawal));
	}
	void simpleInterest() {
		System.out.println("Simple Interest is:"+((p*r*t)/100));
		}
	@Override
	void CompoundInterest() {
		// TODO Auto-generated method stub
		
	}
}
class currentAccount extends Account{

	
	int p;
    int r;
	int t;
	void currentAccountbalance(int totalAmount, int withdrawal,int p,int r,int t) {
		super.balance(totalAmount,withdrawal);
		this.p= p;
		this.r= r;
	    this.t=t;
		
	}
	@Override
	void calculateBalance() {
        System.out.println("balance in your CurrentAccount is:"+(totalAmount-withdrawal));

		
	}

	@Override
	void CompoundInterest() {
		System.out.println("Compound Interest is:"+(p*(1+r/100)^t));

	}

	@Override
	void simpleInterest() {
		// TODO Auto-generated method stub
		
	}
	
}
class RD extends Account{

	@Override
	void CompoundInterest() {
		
	}
	int p;
    int r;
	int t;
	void RDAccountbalance(int totalAmount, int withdrawal,int p,int r,int t) {
		super.balance(totalAmount,withdrawal);
		this.p= p;
		this.r= r;
	    this.t=t;
		
	}

	@Override
	void calculateBalance() {
		System.out.println("Rd account total Amount is:"+(p*(1+r/t)^r*t));
	}

	@Override
	void simpleInterest() {
		
	}
	
}

public class BankAccount {

	public static void main(String[] args) {
		savingsAccount obj1=new savingsAccount();
		obj1.savingsAccountbalance(30000, 150, 4000, 2, 5);
		obj1.calculateBalance();
		obj1.simpleInterest();
		System.out.println("------------------------------------");
		
		currentAccount obj2=new currentAccount();
		obj2.currentAccountbalance(5000, 100, 4500, 5, 4);
		obj2.calculateBalance();
		obj2.CompoundInterest();
		System.out.println("------------------------------------");
		
		RD obj3=new RD();
		obj3.RDAccountbalance(0, 0, 30000, 6, 7);
		obj3.calculateBalance();
		
		
		

	}

}
