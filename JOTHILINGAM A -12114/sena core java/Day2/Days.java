package Day2;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter the number or enter Zero(0) exit the application");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Friday");
			break;
		case 0:
			System.exit(0);
		default:
				System.out.println("Enter the number 1 to 7");
		}
	}

}
}
