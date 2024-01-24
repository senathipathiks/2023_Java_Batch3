//check whether string word is palindrome or not??

package com.day3;

public class Task8 {

	public static void main(String[] args) {
		String s1 = "radr";
		System.out.println("Original word is: "+s1);
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reveresed word: "+s2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Given word is palindrome");
		}
		else {
			System.out.println("Given word is not palindrome");
		}
		
		

	}

}
