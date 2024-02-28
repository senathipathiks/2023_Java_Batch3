package Day2;
import java.util.Scanner;

public class Pattern2  {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows for the right downward triangle");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
