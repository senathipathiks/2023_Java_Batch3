package com.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Person> people=new ArrayList<>();
		
		people.add(new Person("Steve",27));
		people.add(new Person("Oscar",26));
		people.add(new Person("Max",25));
		
		
		// Creating ConcreteIteratorPattern Object
		
		ConcreteIteratorPattern iteratorPattern=new ConcreteIteratorPattern(people);
	
	
		// Using the iterator to traverse the collection of Person Objects
		
		Iterator<Person> iterator=iteratorPattern.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		
		// "without exposing its underlying representation" refers
//		to the ability to traverse or access the elements of a collection
//		(in this case, the collection of form field values) without revealing or making
//		the internal structure or implementation details of the collection available. 
//		This allows for a more modular and encapsulated design, where the collection 
//		can be accessed and manipulated through a consistent interface (the iterator), 
//		without allowing direct access to its internal data representation. 
//		This can help to maintain the integrity and security of the data,
//		and also allow for more flexibility in changing the internal representation
//		or implementation of the collection without affecting the code that relies on it.
	}
}
