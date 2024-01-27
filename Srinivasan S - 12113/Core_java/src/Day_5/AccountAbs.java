package Day_5;


import java.util.Scanner;

/*
 * Account, SavingAccount,CurrentAccount, RD
 */
abstract class Account{
	static Scanner sc=new Scanner(System.in);
    int withdrawal;
    int totalAmount;
     void balance(int totalAmount,int withdrawal ) {
        this.totalAmount=totalAmount;
        this.withdrawal=withdrawal;

    }
     void CompoundInterest() {};
    abstract void calculateBalance();
     void simpleInterest() {};
}
class SavingsAccount extends Account{
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
    	System.out.println("1.Deposit amount \n2.Withdraw amount\n3.Exit");
    	int val=sc.nextInt();
    	if (val==1) {
    		System.out.println("Enter amount to deposit");
    		int dep=sc.nextInt();
    		System.out.println("Rs "+dep+" deposited");
    		System.out.println("Current balance in your SavingsAccount : "+(totalAmount+dep));
    	}
    	else if(val==2) {
    		System.out.println("Enter amount to withdraw");
		int wd=sc.nextInt();
		System.out.println("Rs "+wd+" withdrawned");
        System.out.println("Current balance in your SavingsAccount : "+(totalAmount-wd));
        }
    	else if(val==3) {
    		simpleInterest();
    	}
    }
    void simpleInterest() {
        System.out.println("Simple Interest is:"+((p*r*t)/100));
        }
   
}
class CurrentAccount extends Account{

    
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
    	System.out.println("1.Deposit amount \n2.Withdraw amount\n3.Exit");
    	int val=sc.nextInt();
    	if (val==1) {
    		System.out.println("Enter amount to deposit");
    		int dep=sc.nextInt();
    		System.out.println("Rs "+dep+" deposited");
    		System.out.println("Current balance in your SavingsAccount : "+(totalAmount+dep));
    	}
    	else if(val==2) {
    		System.out.println("Enter amount to withdraw");
		int wd=sc.nextInt();
		System.out.println("Rs "+wd+" withdrawned");
        System.out.println("Current balance in your SavingsAccount : "+(totalAmount-wd));
        }
    	else if(val==3) {
    		CompoundInterest();
    	}
    }

    @Override
    void CompoundInterest() {
        System.out.println("Compound Interest is:"+(p*(1+r/100)^t));

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

    
    
}

public class AccountAbs extends RD {

    public static void main(String[] args) {
    	
    	System.out.println("*****************SBI********************");
    	System.out.println("1.Savings Account \n2.Current Account\n3.RD");
    	
    	int val=sc.nextInt();
    	
    	if(val==1) {
    		
        int bal=0,p=0,r=0,t=0,wd=0;
        SavingsAccount obj1=new SavingsAccount();
        
	
		System.out.println("1.Balance enquiry 2.Interest calculation");
		int opt=sc.nextInt();
		
		if(opt==1) {
			System.out.println("Enter your balance");
        	 bal=sc.nextInt();
        obj1.savingsAccountbalance(bal, wd, p, r, t);
        obj1.calculateBalance();}
	
		else if(opt==2) {
			
			System.out.println("Enter principle amt");
        	 p=sc.nextInt();
        	
        	System.out.println("Enter rate of interest");
        	 r=sc.nextInt();
        	
        	System.out.println("Enter time period");
        	 t=sc.nextInt();
        obj1.savingsAccountbalance(bal, wd, p, r, t);
        obj1.simpleInterest();}
    	}
    	
    	else if(val==2) {
    		
    		System.out.println("1.Balance enquiry 2.Interest calculation");
    		int opt=sc.nextInt();
    		
    		CurrentAccount obj2=new CurrentAccount();
    		int bal=0,p=0,r=0,t=0,wd=0;
    		
    		if(opt==1) {
    			System.out.println("Enter your balance");
            	bal=sc.nextInt();
            	obj2.currentAccountbalance(bal, wd, p, r, t);
                obj2.calculateBalance();
    		}
    		
    		else if (opt==2) {
        	
        	System.out.println("Enter principle amt");
        	p=sc.nextInt();
        	System.out.println("Enter rate of interest");
        	r=sc.nextInt();
        	System.out.println("Enter time period");
        	t=sc.nextInt();
        	
        	obj2.currentAccountbalance(bal, wd, p, r, t);
        	obj2.CompoundInterest();
    		}
        
        
    	}
    	else if(val==3) {
    		
    		int bal=0,p=0,r=0,t=0,wd=0;
        	System.out.println("Enter principle amt");
        	 p=sc.nextInt();
        	System.out.println("Enter rate of interest");
        	 r=sc.nextInt();
        	System.out.println("Enter time period");
        	 t=sc.nextInt();
        RD obj3=new RD();
        obj3.RDAccountbalance(bal, wd, p, r, t);
        obj3.calculateBalance();
    	}
        
        
        

    }

}