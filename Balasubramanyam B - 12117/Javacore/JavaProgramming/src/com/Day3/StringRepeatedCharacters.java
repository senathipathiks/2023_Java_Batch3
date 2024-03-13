package com.Day3;
import java.util.*;
public class StringRepeatedCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String name : ");
        int count=0;
        String str = sc.nextLine();
//      String str = new String("balasubramanyam");
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++) {
        	for(int j=i+1;j<c.length;j++) {
        		if(c[i]==c[j]) {
        			System.out.println("Repeated charecters: "+c[j]);
        			count++;
        		}
        	}
        } System.out.println("Repeated count: "+count);
        }

}
