package com.coreday1;

interface Account {
    double calcInterest();
}

// Implement the Account interface in SavingsAccount
class SavingsAccount implements Account {
    private double balance;

    // Constructor
    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    // Implement the calcInterest method
    public double calcInterest() {
        double interestRate = 0.05; // 5% interest rate
        return balance * interestRate;
    }
}

// Implement the Account interface in CurrentAccount
class CurrentAccount implements Account {
    private double balance;

    // Constructor
    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    // Implement the calcInterest method
    public double calcInterest() {
        double interestRate = 0.2; // 20% interest rate
        return balance * interestRate;
    }
}

// Test the classes
public class Interest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10000);
        System.out.println("Savings Account Interest: " + sa.calcInterest());

        CurrentAccount ca = new CurrentAccount(1000);
        System.out.println("Current Account Interest: " + ca.calcInterest());
    }
}