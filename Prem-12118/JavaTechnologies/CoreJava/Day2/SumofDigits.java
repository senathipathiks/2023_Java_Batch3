 package Day2;
import java.util.*;

public class SumofDigits {

    public static void main(String[] args) {
        System.out.println("Enter the number you want to find the sum of digits");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, r;

        // Iterate through each digit
        while (n > 0) {
            r = n % 10;   // Get the last digit
            sum = sum + r; // Add the digit to the sum
            n = n / 10;    // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
