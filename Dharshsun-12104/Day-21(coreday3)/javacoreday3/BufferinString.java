package com.coreday3;

public class BufferinString {
   public static void main(String args[]) {
	   StringBuffer s1 = new StringBuffer("Java");
	   System.out.println(s1.append("Programmer"));
//	   System.out.println(s1.reverse());
	   System.out.println(s1.length());
	   System.out.println(s1.insert(4," is a "));
	   System.out.println(s1.replace(0,4,"Dharshsun"));
   }
}
