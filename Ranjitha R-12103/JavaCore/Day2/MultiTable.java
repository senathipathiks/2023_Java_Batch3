/* Write a Java program that takes a number as input and 
prints its multiplication table up to 10.*/
package Day2;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = obj1.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

}
