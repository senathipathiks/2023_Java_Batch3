package Com.Day6;

import java.util.StringJoiner;

public class StringJoinerEg {
	
//--combine or merge 2 or more strings
	
public static void main(String[] args) {
		
		StringJoiner s=new StringJoiner(":-*-:");
		s.add("Python");
		s.add("Java");
		s.add("JavaScript");
		
		s.setEmptyValue("null");// if set is empty it will print null
		
		System.out.println(s);
		
		System.out.println("----------------");
		
		StringJoiner s1=new StringJoiner("$ ", "\\", "/"); //one slash for escape prefix escape sequence..
		s1.add("Python");
		s1.add("Java");
		s1.add("JavaScript");
		
		System.out.println(s1);
		System.out.println("----------------");
		System.out.println(s1.merge(s));

		}

}
