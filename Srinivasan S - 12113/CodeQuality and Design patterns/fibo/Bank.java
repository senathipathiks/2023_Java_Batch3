package com.code.fibo;



// We have to create seperate class for all classes in the type of single responsibility principle
public class Bank {

	public void Account() {
		// code for account details
	}

}

class Transaction {

	public void Deposit(double amount, String accNumber) {
		// code for deposit
	}

	public void withdraw(double amount, String accNumber) {
		// code for withdraw
	}
}

class Passbook {
	public void printPassbook(String accNumber) {
		// code for pass book
	}
}

class Loan {
	public void printLoanInterestRate(String loanType, String accNumber) {
		if (loanType.equals("vehicleloan")) {
			// code for vehicle loan
		} else if (loanType.equals("homeLoan")) {
			// code for home loan
		}
	}
}