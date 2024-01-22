package Day2;

import java.util.Scanner;

//12. Reverse a no.
public class ReverseNumber {

	 
		public static void main(String[] args)   
		{  
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int m,temp;
			for(int i=0;i<=n;i++) {
				m=n%10;
				temp=m;
				n=n/10;
				System.out.print(temp);
			}}}
			



