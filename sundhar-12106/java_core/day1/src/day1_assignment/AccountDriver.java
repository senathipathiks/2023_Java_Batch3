package day1_assignment;

import java.util.Scanner;

/*
Create an interface named account with a method of calcInterest(). Create the classes
named SavingsAccount and CurrentAccount to implement the interface. Define the calcInterest
and show the result.
*/
interface Account {
	public double calcIntrest(double principle);
}

class SavingAccount implements Account {

	@Override
	public double calcIntrest(double principle) {
		return principle * 6.18;
	}

}

class CurrentAccount implements Account {

	@Override
	public double calcIntrest(double principle) {
		return principle * 12.18;
	}

}

public class AccountDriver {

	public static void main(String[] args) {

		boolean b = true;

		Scanner sc = new Scanner(System.in);

		Account saving = new SavingAccount();
		Account current = new CurrentAccount();

		while (b) {
			System.out.println("\t\tCalculating intrest ");
			System.out.println("1.Saving account\n2.current account\n3.exit");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the principle amount");
				System.out.println(saving.calcIntrest(sc.nextDouble()));
				break;
			}
			case 2: {
				System.out.println("enter the principle amount");
				try {
					System.out.println(current.calcIntrest(sc.nextDouble()));
				} catch (Exception e) {
					System.out.println("enter valid input..!");
					sc.next();
				}
				break;
			}
			case 3: {
				b= false;
				System.out.println("***********Thank You***********");
				break;
			}

			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}
