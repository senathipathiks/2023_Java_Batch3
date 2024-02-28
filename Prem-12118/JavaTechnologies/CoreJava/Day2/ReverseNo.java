package Day2;
import java.util.*;

public class ReverseNo {

    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse the order");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String numberString = Integer.toString(number);
        int[] digitArray = new int[numberString.length()];
        int[] newArray = new int[numberString.length()];

        // Populate digitArray with individual digits
        for (int i = 0; i < numberString.length(); i++) {
            digitArray[i] = Character.getNumericValue(numberString.charAt(i));
        }

        // Reverse the order of digits and store in newArray
        for (int i = numberString.length() - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = digitArray[i];
        }

        // Print the reversed array
        System.out.println("Reversed order of digits:");
        for (int digit : newArray) {
            System.out.print(digit);
        }
    }
}
