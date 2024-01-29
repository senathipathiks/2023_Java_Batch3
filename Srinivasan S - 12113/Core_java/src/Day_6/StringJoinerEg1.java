package Day_6;

import java.util.StringJoiner;

public class StringJoinerEg1 {

	public static void main(String[] args) {
//		StringJoiner s=new StringJoiner(",");
//		s.add("Java");
//		s.add("Python");
//		System.out.println(s);
		
		StringJoiner s1=new StringJoiner("$","\\","/");
		s1.add("Java");
		s1.add("Python");
		s1.add("c");
		System.out.println(s1);
		
	}

}
