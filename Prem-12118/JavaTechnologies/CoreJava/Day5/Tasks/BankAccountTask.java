package Day5.Tasks;

interface Account {

    // Method to initialize data
    default void getData(int accNo, String cName, float balance) {
        // This method can be overridden in implementing classes
    }

    // Method to display details
    void details();
}

class Saccount implements Account {

    // Fields from the interface
    int accNo;
    String cName;
    float balance;

    // Implementing the getData method from the interface
    @Override
    public void getData(int accNo, String cName, float balance) {
        this.accNo = accNo;
        this.cName = cName;
        this.balance = balance;
    }

    // Implementing the details method
    @Override
    public void details() {
        System.out.println("The Account Number of Customer is:" + accNo);
        System.out.println("The Customer Name is:" + cName);
        System.out.println("The Balance in the account:" + balance);
    }
}

public class BankAccountTask {

    public static void main(String[] args) {
        // Create an instance of Saccount
        Saccount saccount = new Saccount();

        // Initialize data using the method from the interface
        saccount.getData(123, "John Doe", 1000.0f);

        // Display details
        saccount.details();
    }
}
