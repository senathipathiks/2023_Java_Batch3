package CoreTopic;

interface Account {
    void calcInterest();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calcInterest() {
        double interest = balance * interestRate / 100;
        System.out.printf("Savings account interest: $%.2f\n", interest);
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double interestRate;

    public CurrentAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calcInterest() {
        double interest = balance * interestRate / 100;
        System.out.printf("Current account interest: $%.2f\n", interest);
    }
}

public class Accountmain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 2.5);
        CurrentAccount currentAccount = new CurrentAccount(2000, 3.5);

        savingsAccount.calcInterest();
        currentAccount.calcInterest();
    }
}

