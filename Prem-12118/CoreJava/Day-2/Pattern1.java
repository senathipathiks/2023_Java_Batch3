package Day2;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		
		 System.out.println("Enter the number of rows of * needs at max row");
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		 int i,j;
		 for (i=0; i<n;i++) {
			 
			 for( j=0;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 

	}

}
