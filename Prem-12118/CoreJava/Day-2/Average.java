package Day2;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		 System.out.println("Enter the three numbers to find Avg");
	     Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
	      
	     double avg=(a+b+c)/3;
	     System.out.println("The Average of the three number is:"+avg);
		
		
	}

}
