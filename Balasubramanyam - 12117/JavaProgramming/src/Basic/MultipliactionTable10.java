package com.Basic;
import java.util.*;
public class MultipliactionTable10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the tables number : ");
    int a = sc.nextInt();
    int i = 1;
    while(i<=10) {
    	System.out.println(a+" X "+i+" = "+(a*i));
    	i++;
    }
    
	}

}
