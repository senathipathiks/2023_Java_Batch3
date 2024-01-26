package com.Oops;
interface Account {
    double calcInterest();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double interestRate;

    public CurrentAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }
}


public class AccountInterestCal {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
		CurrentAccount currentAccount = new CurrentAccount(2000, 0.03);

		System.out.println("Interest earned on savings account: $" + savingsAccount.calcInterest());
		System.out.println("Interest earned on current account: $" + currentAccount.calcInterest());

	}

}
