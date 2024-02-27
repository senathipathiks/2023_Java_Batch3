package Day2;

import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int userInput = scanner.nextInt();

		        String binaryRepresentation = "";
		        int originalNumber = userInput;

		        if (userInput == 0) {
		            binaryRepresentation = "0";
		        } else {
		            while (userInput > 0) {
		                int remainder = userInput % 2;
		                binaryRepresentation = remainder + binaryRepresentation;
		                userInput /= 2;
		            }
		        }

		        System.out.println("Binary representation of " + originalNumber + ": " + binaryRepresentation);

		        scanner.close();
		    }
		

	}


