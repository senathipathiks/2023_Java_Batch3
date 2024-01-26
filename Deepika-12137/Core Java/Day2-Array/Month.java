package Day2;
import java.util.*;
public class Month {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
    System.out.println("Enter the no of month : ");
	int m=sc.nextInt();
	switch (m) {
	case 1:
		System.out.println("January has 31 ");
		break;
	case 2:
		System.out.println("February has 28 ");
		break;
	case 3:
		System.out.println("March has 31 ");
		break;
	case 4:
		System.out.println("April has 30 ");
		break;
	case 5:
		System.out.println("May has 31 ");
		break;
	case 6:
		System.out.println("June has 30 ");
		break;
	case 7:
		System.out.println("July has 31 ");
		break;
	case 8:
		System.out.println("August has 31 ");
		break;
	case 9:
		System.out.println("September has 30 ");
		break;
	case 10:
		System.out.println("October has 31 ");
		break;
	case 11:
			System.out.println("November has 30");
			break;
	case 12:
		System.out.println("December has 31 ");
		break;
		

	default:
		break;
	}
}}
