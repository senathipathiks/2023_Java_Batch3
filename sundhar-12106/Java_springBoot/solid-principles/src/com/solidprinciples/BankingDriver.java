package com.solidprinciples;

public class BankingDriver {

	public static void main(String[] args) {

	}

}

class WithdrawMoney {

	void withdrawMoney(int anmount, String accNumber) {
		// code for money withdraw
	}

}

class DepositMoney {
	void depositMoney(int anmount, String accNumber) {
		// code for money deposit
	}
}

class PrintIntrestRate {
	void printLoanIntrestRate(String loanType) {

		switch (loanType) {
		case "carloan": {
			// print car loan interest
			break;
		}

		case "bikeloan": {
			// print bike loan interest
			break;
		}

		case "homeloan": {
			// print home loan interest
			break;
		}
		default:{
			// print default interest
		}

		}

	}
}

class PrintPassbook {

	void printPassbook(long accNumber) {
		// print account passbook
	}

}
