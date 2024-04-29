package com.Code;

public class Banking {
	
	//Doesn't follow SRP
	
//	void depositMoney(int amount, String accountNumber) {
//			
//		//To Deposit the Money
//	}
//	
//	void withDrawMoney(int amount, String password) {
//		
//		//To Withdraw Money
//	}
//	
//	void printLoanInterestRate(String loanType) {
//		
//		if(loanType.equals("carloan"))
//		{
//			//Car loan code here
//		}
//		else if(loanType.equals("Homeloan")) {
//			//Home loan code here
//		}
//	}
	
	public static void main(String[] args) {
		
		Deposit depo = new Deposit();
		WithDraw draw = new WithDraw();
		Interest inter  = new Interest();
		
		depo.depositMoney(350, "717901010050100");
		draw.withDrawMoney(50, "7698");
		inter.printLoanInterestRate("carloan");
		}

}
