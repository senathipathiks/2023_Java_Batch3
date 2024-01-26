package Day_2;

import java.util.Scanner;

public class BinaryToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int index=0;
		int binary[]=new int[10];
		for (;num>0;) {
			binary[index++]=num%2;
			num=num/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		
	}


}
