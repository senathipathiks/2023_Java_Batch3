package Day2;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String binary1 = scanner.nextLine();

        System.out.println("Enter the second binary number:");
        String binary2 = scanner.nextLine();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;

        System.out.println("The sum is: " + Integer.toBinaryString(sum));
    }
}
