package ATM;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Rupees50Dispenser();
		DispenseChain c2 = new Rupees20Dispenser();
		DispenseChain c3 = new Rupees10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
			
			
			
			System.out.println("Do you want to continue? (yes/no)");
            String response = input.next();
            if (!response.equals("yes")) {
                System.out.println("Thank you for using the ATM. Have a great day!");
                break;
            }
		}

	}

}