package Day2;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the prime number");
		int n=sc.nextInt();
		System.out.println("Prime numbers between 1 to "+n+" are ");
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for( int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;        
				}
			}
			if(count==2)
				System.out.print(i+"  ");     
		}
	}
}

