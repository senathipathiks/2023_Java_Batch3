package com.solidprinciples;

public class GoalLoanService extends LoanService{

	@Override
	void printLoanIntrestRate(String loanType) {
		super.printLoanIntrestRate(loanType);
		if(loanType.equals("goldloan")) {
			//gold loan interest rate
		}
	}
	
	

}
