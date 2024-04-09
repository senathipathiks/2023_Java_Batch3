package com.solid;

//open closed principle
//extending the previous class and edit it( master and branch) 
public class GoldLoanService extends LoanService  {
	
	void printLoanInterface(String LoanType) {
		if (LoanType.equals("carloan")) {

		} else if (LoanType.equals("bikeLoan")) {

		}else if(LoanType.equals("goldLoan")) {
			
		}
	}

}
