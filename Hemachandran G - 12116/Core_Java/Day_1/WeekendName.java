package Day_1;

import java.util.Scanner;

public class WeekendName {
	
	
		 
	//  char operator;
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
