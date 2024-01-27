package com.day6;
import java.util.*;
import java.util.function.Predicate;

public class FunctionInterfacePredicateEg {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Vinolisha","Sherin","Kaviya","Sowmi","Deepika","Varshini","Renji","Nanthini");
		//declare the predicate type as string and use
		//lambda expression to create object
		
		Predicate<String> p = (s)-> s.startsWith("S");
		
		//Iterate through the list
		for(String st:names) {
			//call the test method
			if(p.test(st))
				System.out.println(st);
		}
		

	}

}
