package oops;
import java.util.Scanner;
public class Calculator {
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	 

	        System.out.print("Enter the first number: ");
	        int firstNumber = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        int secondNumber = sc.nextInt();
	 

	        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
	        String operation = sc.next();
	        int result = performOperation(firstNumber, secondNumber, operation);
	        System.out.println("Your answer is: " + result);
	    }
	 
	    public static int performOperation(int firstNumber, int secondNumber, String operation)
	    {
	        int result = 0;
	        switch (operation) {
	            case "+":
	                result = firstNumber + secondNumber;
	                break;
	            case "-":
	                result = firstNumber - secondNumber;
	                break;
	            case "*":
	                result = firstNumber * secondNumber;
	                break;
	            case "%":
	                result = firstNumber % secondNumber;
	                break;
	            case "/":
	                result = firstNumber / secondNumber;
	                break;
	            default:
	                System.out.println("Invalid operation");
	                break;
	        }
	        return result;
	    }
	}   
        
        
        

