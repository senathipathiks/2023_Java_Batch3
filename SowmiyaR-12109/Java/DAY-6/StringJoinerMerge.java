package Day6;

import java.util.StringJoiner;

public class StringJoinerMerge {

	public static void main(String[] args) {
		
		
		StringJoiner s=new StringJoiner(",");
		s.add("html");
		s.add("css");
		s.add("js");
		
		s.setEmptyValue("node");
		System.out.println(s);
		
		StringJoiner s1= new StringJoiner("$","\\","/");
		s1.add("Java");
		s1.add("python");
		s1.add("javascript");
		
//		System.out.println(s1.merge(s));
		System.out.println(s1);
		

	}

}
