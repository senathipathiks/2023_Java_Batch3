package Day6;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		
//		StringJoiner s=new StringJoiner(",");
//		s.add("Java");
//		s.add("python");
//		s.add("javascript");
//		
//		System.out.println(s);
		
		StringJoiner s1= new StringJoiner("$","\\","/");
		s1.add("Java");
		s1.add("python");
		s1.add("javascript");
		
		System.out.println(s1);
		System.out.println(s1.length());

	}

}
