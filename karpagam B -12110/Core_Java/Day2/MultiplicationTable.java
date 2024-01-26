package Com.Day2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,m;
    System.out.println("Enter the multiplication table number");
    n=sc.nextInt();
    for(int i=1;i<=10;i++) {
         m=i*n;
		System.out.println(i+"*"+n+"="+m);}
	}

}
