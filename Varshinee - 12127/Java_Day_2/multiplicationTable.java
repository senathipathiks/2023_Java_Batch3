package Java_Day_2;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a + "X" + i +"=" + a*i);
		}
		

	}

}
