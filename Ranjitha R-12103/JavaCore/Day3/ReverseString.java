package Day3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to reverse");
        str=sc.nextLine();
        String rev=" ";
          
        String s[]=str.split(" ");
        System.out.println(s);
        for (int i=0;i<s.length;i++) {
			rev=s[i]+" "+rev;
		}
          System.out.println("Your Reversed String is:"+rev);
	}

}
