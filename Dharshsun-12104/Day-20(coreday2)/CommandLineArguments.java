public class CommandLineArguments {
    public static void main(String[] args) {
        // Convert command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform operations
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}




Output:

D:\javaprograms>java CommandLineArguments 17 6
Sum: 23
Product: 102
Difference: 11
Quotient: 2
Remainder: 5