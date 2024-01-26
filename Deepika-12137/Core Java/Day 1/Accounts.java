package oops;
interface Account {
	double calcInterest();
}

class SavingsAccount implements Account {
    private double balance;
    public SavingsAccount(double balance) {
        this.balance = balance;
    }
   
    public double calcInterest() {     
        double interestRate = 0.05;
        return balance * interestRate;
    }

    public void showResult() {
        System.out.println("Savings Account Interest: " + calcInterest());
    }
}

class CurrentAccount implements Account {
    private double balance;
    public CurrentAccount(double balance) {
        this.balance = balance;
    }
  
    public double calcInterest() {
    	double interestRate=0.05;
        return balance*interestRate;
    }

    public void showResult() {
        System.out.println("Current Account Interest: " + calcInterest());
    }}

public class Accounts {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.showResult();  // Output: Savings Account Interest: 50.0

        CurrentAccount currentAccount = new CurrentAccount(1500.0);
        currentAccount.showResult();  // Output: Current Account Interest: 0.0
    }
}

