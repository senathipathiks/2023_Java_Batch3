package Com.Day2;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		      int n;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the prime number range:");
              n=sc.nextInt();
              for(int i=1;i<n;i++) {
            	  for (int j = 2; j <=i;) {
					
				
            	  if( i%j==0) {
                	break;
            	  }
            	  else 
            		  System.out.println(i);
            	  break;
            	
            	  }
              }
              
	}

}
