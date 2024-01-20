package com.day1;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the element to insert ");
        int element=sc.nextInt();
        System.out.println("Enter the position");
        int position=sc.nextInt();
        int[] a= {5,7,3,9,1,4};
        
        
        for (int i = 0; i < a.length; i++) {
            if(i==position) {
                a[i]=element;
                System.out.print(a[i]+" ");
            }else {
                System.out.print(a[i]+" ");
            }
          
        }
	}

}
