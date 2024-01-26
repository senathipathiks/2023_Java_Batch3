package Day2;
//9. Write a Java program that takes a number from the user 
//and generates an integer between 1 and 7. 
//It displays the weekday name.
import java.util.Scanner;
public class DisplayWeekendName {
   
//    char operator;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 1 to 7 ");
		int a=sc.nextInt();
		 String Days = null;
		switch(a) {
		case 1:
			Days="Sunday";
			break;
		case 2:
			Days ="Monday";
			break;
		case 3:
			Days ="Tuesday";
			break;
		case 4:
			Days ="Wednesday";
			break;
		case 5:
			Days ="Thursday";
			break;
		case 6:
			Days ="Friday";
			break;
		case 7:
			Days ="Saturday";
			break;
		default:
			System.out.println("Enter  between 1 to 7");
			}
		System.out.println("The Weekend day is: "+Days);
		
		

	}

}
