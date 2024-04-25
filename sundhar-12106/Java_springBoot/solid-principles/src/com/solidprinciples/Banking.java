package com.solidprinciples;

public class Banking {
	
	void depositMoney(int anmount,String accNumber) {
		//code for money deposit
	}
	
	void withdrawMoney(int anmount,String accNumber) {
		//code for money withdraw
	}
	
	void printLoanIntrestRate(String loanType) {
		if (loanType.equals("carloan")) {
			//car loan intrest
		} else if(loanType.equals("bikeloan")) {
			//bike loan intrest
		}else if(loanType.equals("homeloan")) {
			//home loan intrest
		}
	}
	
	void printPassbook(long accNumber) {
		//print account passbook
	}

}
