package Day1;

import java.util.Scanner;

public class Calcualtor {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/):");
        char operator = sc.next().charAt(0);
        double Result = 0;
        switch (operator) {
            case '+':
                Result = num1 + num2;
                break;
            case '-':
            	Result = num1 - num2;
                break;
            case '*':
            	Result = num1 * num2;
                break;
            case '/':
            	Result = num1 / num2;
                break;
            default:
                System.out.println("You entered wrong input");
        }
        System.out.println("The final result:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + Result);
    }
}

