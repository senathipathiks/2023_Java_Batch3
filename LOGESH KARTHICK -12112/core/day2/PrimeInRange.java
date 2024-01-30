package core.day2;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) 
	{
		int start,end,flag=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the start value");
		start=in.nextInt();
		System.out.println("enter the end value");
		end=in.nextInt();
        for (int n=start;n<=end;n++)
        {
        	for( int i=2;i<n;i++)
        	{
        		if(n%i==0)
        		{
        			flag=1;
        			break;
        		}
        		if(flag==0)
        		{
        			System.out.println(n + "");
        		}
        		flag =0;
        	}
        	}
        }
	}


