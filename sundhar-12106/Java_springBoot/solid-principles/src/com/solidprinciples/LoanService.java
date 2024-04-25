package com.solidprinciples;

public class LoanService {

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
		default: {
			// print default interest
		}

		}

	}

}
