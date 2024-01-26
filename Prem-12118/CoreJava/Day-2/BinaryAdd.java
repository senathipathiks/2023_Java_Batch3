package Day2;

import java.util.Scanner;

public class BinaryAdd {

	public static void main(String[] args) {
		  
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first binary number: ");
		        String firstBinaryNumber = scanner.nextLine();

		        System.out.print("Enter the second binary number: ");
		        String secondBinaryNumber = scanner.nextLine();

		        int firstDecimalNumber = Integer.parseInt(firstBinaryNumber, 2);
		        int secondDecimalNumber = Integer.parseInt(secondBinaryNumber, 2);

		        int sum = firstDecimalNumber + secondDecimalNumber;
		        String binarySum = Integer.toBinaryString(sum);

		        System.out.println("The sum of " + firstBinaryNumber + " and " + secondBinaryNumber + " is " + binarySum + " in binary and " + sum + " in decimal.");

		        scanner.close();
		    }
	}


