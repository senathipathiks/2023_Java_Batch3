package Day6;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner s=new StringJoiner(",");
		
		s.add("jothi");s.add("Sanjay");s.add("Siva");s.add("Deva");
		
		System.out.println(s);
		
		
		StringJoiner s1= new StringJoiner("$", "\\", "/");
		s1.add("jothi");s1.add("Sanjay");s1.add("Siva");s1.add("Deva");
		System.out.println(s1.length());
		
		
		System.out.println(s1.merge(s));
		

	}

}
