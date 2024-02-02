package Day1;

import java.util.Scanner;

/*
Create an interface named account with a method of calcInterest(). Create the classes
named SavingsAccount and CurrentAccount to implement the interface. Define the calcInterest
and show the result.
*/
interface Accountt {
    public double calcIntrest(double principle);
}

class SavingAccount implements Accountt {

    @Override
    public double calcIntrest(double principle) {
        return principle * 6.18;
    }

}

class CurrentAccount implements Accountt {

    @Override
    public double calcIntrest(double principle) {
        return principle * 12.18;
    }

}

public class Account {

    public static void main(String[] args) {

        boolean b = true;

        Scanner sc = new Scanner(System.in);

        Accountt saving = new SavingAccount();
        Accountt current = new CurrentAccount();

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
                System.out.println(current.calcIntrest(sc.nextDouble()));
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