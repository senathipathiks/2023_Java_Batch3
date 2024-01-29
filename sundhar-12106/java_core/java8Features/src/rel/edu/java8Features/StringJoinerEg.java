package rel.edu.java8Features;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {

		StringJoiner s = new StringJoiner(",");
		s.add("html");
		s.add("css");
		s.add("js");
////		s.add("");
//		
		s.setEmptyValue("node");
//		
//		System.out.println(s);

		StringJoiner s1 = new StringJoiner("$", "\\", "/");
		s1.add("java");
		s1.add(" python");
		s1.add(" PHP");

//		System.out.println(s1.merge(s));
		System.out.println(s);

//		 StringJoiner joinNames = new StringJoiner(",","[","]"); // passing comma(,) as delimiter   
//         
//	        // Adding values to StringJoiner  
//	        joinNames.add("Rahul");  
//	        joinNames.add("Raju");  
//	        joinNames.add("Peter");  
//	        joinNames.add("Raheem");  
//	        
//	        System.out.println(joinNames);
//	        
//	        System.out.println("---------------------------------");

		// Creating StringJoiner with , delimiter
//	        StringJoiner joinNames2 = new StringJoiner(",", "[", "]");  // passing (,) and square-brackets as delimiter   
//	          
//	        // Adding values to StringJoiner  
//	        joinNames2.add("Peter");  
//	        joinNames2.add("Raheem"); 
//	      
//	        
//	        System.out.println(joinNames.merge(joinNames2));
//	        
//	        System.out.println("------------------------------");
	}

}
