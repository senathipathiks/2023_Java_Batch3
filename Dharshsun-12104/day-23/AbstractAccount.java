package com.javacoreday5;
abstract class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. New balance is " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New balance is " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. New balance is " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New balance is " + balance);
        } else {
            System.out.println("Insufficient balance in Current Account.");
        }
    }
}

class RecurrenceDeposit extends Account {
    RecurrenceDeposit(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Recurrence Deposit Account. New balance is " + balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawal not allowed from Recurrence Deposit Account.");
    }
}

public class AbstractAccount {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("SA123", 5000.0);
        Account currentAccount = new CurrentAccount("CA123", 10000.0);
        Account recurrenceDeposit = new RecurrenceDeposit("RD123", 2000.0);

        savingsAccount.deposit(1000.0);
        savingsAccount.withdraw(5000.0);
        currentAccount.deposit(2000.0);
        currentAccount.withdraw(12000.0);
        recurrenceDeposit.deposit(1000.0);
        recurrenceDeposit.withdraw(1000.0);
    }
}
