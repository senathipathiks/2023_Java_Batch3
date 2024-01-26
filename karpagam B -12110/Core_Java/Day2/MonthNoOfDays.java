package Com.Day2;

import java.util.Scanner;

public class MonthNoOfDays {

	public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int m;
              System.out.println("Enter the month number:");
              m=sc.nextInt();
              
              switch(m) {
              case 1:
            	  System.out.println("Your January month total day is 31");
            	  break;
              case 2:
            	  System.out.println("Your February month total day is 28 or 29 if it is leap year");
            	  break;
              case 3:
            	  System.out.println("Your March month total day is 31");
            	  break;
              case 4:
            	  System.out.println("Your April month total day is 30");
            	  break;
              case 5:
            	  System.out.println("Your May month total day is 31");
            	  break;
              case 6:
            	  System.out.println("Your June month total day is 30");
            	  break;
              case 7:
            	  System.out.println("Your July month total day is 31");
            	  break;
              case 8:
            	  System.out.println("Your August month total day is 31");
            	  break;
              case 9:
            	  System.out.println("Your September month total day is 30");
            	  break;
              case 10:
            	  System.out.println("Your October month total day is 31");
            	  break;
              case 11:
            	  System.out.println("Your November month total day is 30");
            	  break;
              case 12:
            	  System.out.println("Your Decemeber month total day is 31");
            	  break;
            	  default:
            		  System.out.println("----");
            	  
            	  
              }
	}

}
