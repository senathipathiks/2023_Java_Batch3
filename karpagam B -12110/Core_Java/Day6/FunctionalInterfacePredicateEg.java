package Com.Day6;

import java.util.*;
import java.util.function.Predicate;


public class FunctionalInterfacePredicateEg {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("kaviya","karpagam","kalai","vino");
		
		
		//declare the predicate type as string and then use
		// lambda expression to create the object
		
		Predicate<String> p=(s)->s.startsWith("ka");
		
		//	iterate through the list
		for(String st:names) {
		//call the test method
		   if(p.test(st)) {
				System.out.println(st);
			}
		}

	}

}
