package Day2;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		
		
	        
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the Range of the number to find Prime Numbers !!");
	        n=s.nextInt();
	        for(int i=1;i<n;i++) {
	            for(int j=2;j<i;j++) {
	                if( i%j==0) {
	                    break;
	                    
	                }
	                
	                else {
	                    System.out.println(i);
	                    break;
	                }
	            }
	        }

	    }

	}
