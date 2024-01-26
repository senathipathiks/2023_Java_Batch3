package Day_1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = a+b+c;
		
		System.out.println("The Average of the Given Number is " + d/3);

	}

}
