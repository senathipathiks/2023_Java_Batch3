package rel.oops.day5.abstraction;

import java.util.Scanner;

abstract class Account {

	String name;
	long acNo;
	String acctype;
	double balance;

	public Account(String name, long acNo, String acctype, double balance) {

		this.name = name;
		this.acNo = acNo;
		this.acctype = acctype;
		this.balance = balance;
	}

	abstract double availBalance();

}

class SavingAccount extends Account {

	public SavingAccount(String name, long acNo, String acctype, double balance) {
		super(name, acNo, acctype, balance);

	}

	@Override
	double availBalance() {
		System.out.println("enter No.Of.Days Account created");
		return balance + (balance * ((new Scanner(System.in).nextInt()) / 365.24) * 3.8) / 100;
	}

}

class CurrentAccount extends Account {

	public CurrentAccount(String name, long acNo, String acctype, double balance) {
		super(name, acNo, acctype, balance);

	}

	@Override
	double availBalance() {
		System.out.println("enter No.Of.Days Account created");
		return balance + (balance * ((new Scanner(System.in).nextInt()) / 365.24) * 8.4) / 100;
	}

}

class RDAccount extends Account {

	public RDAccount(String name, long acNo, String acctype, double balance) {
		super(name, acNo, acctype, balance);

	}

	@Override
	double availBalance() {
		System.out.println("enter No.Of.Days Account created");
		return balance + (balance * ((new Scanner(System.in).nextInt()) / 365.24) * 6.4) / 100;
	}

}

public class AccountDriver {

	public static void main(String[] args) throws Exception {
//		System.out.println((long) (Math.random()*Math.pow(10,15)));

		Scanner sc = new Scanner(System.in);

		boolean b = true;
		
		Account sb = null;

		while (b) {
			System.out.println("\t\t\tWelcome to banking System");
			System.out.println(
					"1. Create Saving Account\n2. Create Current Account\n3.Create RD Account\n4.Check Balance\n5.Exit");
			switch (sc.nextInt()) {
			case 1:
				long accno = (long) (Math.random()*Math.pow(10,15));
				sb = new SavingAccount("Sundhar Raj S", accno, "SB", 1000.0);
				System.out.println("\t\t\t\"Account created successfully...!\"\n\t Account Number is : "+accno);
				break;
			case 2:
				long accnoCa = (long) (Math.random()*Math.pow(10,15));
				sb = new SavingAccount("Sundhar Raj S", accnoCa, "SB", 1000.0);
				System.out.println("\t\t\t\"Account created successfully...!\"\n\t Account Number is : "+accnoCa);
				break;
			case 3:
				long accnoRd = (long) (Math.random()*Math.pow(10,15));
				sb = new SavingAccount("Sundhar Raj S", accnoRd, "SB", 1000.0);
				System.out.println("\t\t\t\"Account created successfully...!\"\n\t Account Number is : "+accnoRd);
				break;
			case 4:{
				Thread.sleep(1000);
				System.out.println("Available Balance : "+ sb.availBalance());
				break;}
			case 5:{
				 b=false;
				 System.out.println("\t\tThank You for banking with us");
				break;}

			default:
				System.out.println("please enter valid input");
				break;
			}
		}
	}

}
