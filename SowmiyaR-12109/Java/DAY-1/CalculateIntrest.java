//Create an interface named account with a method of calcInterest(). Create the classes
//named SavingsAccount and CurrentAccount to implement the interface. Define the calcInterest
//and show the result.
package Day1;
 
interface Account {
    double calcInterest();
}

class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double calcInterest() {
        // Assume a simple interest rate for illustration purposes
        double interestRate = 0.05; // 5%
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

    @Override
    public double calcInterest() {
        // Current accounts might not have interest, so let's assume 0 for illustration
        return 0;
    }

    public void showResult() {
        System.out.println("Current Account Interest: " + calcInterest());
    }}
public class CalculateIntrest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.showResult();  // Output: Savings Account Interest: 50.0

        CurrentAccount currentAccount = new CurrentAccount(1500.0);
        currentAccount.showResult();  // Output: Current Account Interest: 0.0
    }
}
