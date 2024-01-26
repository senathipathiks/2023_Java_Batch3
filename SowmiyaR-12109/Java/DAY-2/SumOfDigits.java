package Day2;
//11. Sum of Digits
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
	int sum=0;
	int m;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		m=n%10;
		sum=sum+m;
//		n=n%10;
		}
	System.out.println(sum);
			

	

}}
