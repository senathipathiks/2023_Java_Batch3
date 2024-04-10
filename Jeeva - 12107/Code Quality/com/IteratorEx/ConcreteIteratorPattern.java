package com.IteratorEx;

import java.util.Iterator;
import java.util.List;

public class ConcreteIteratorPattern implements IteratorPattern {

	private List<Person> personList;
	
	
	
	public ConcreteIteratorPattern(List<Person> personList) {
		
		this.personList = personList;
	}



	@Override
	public Iterator createIterator() {
		
		return personList.iterator();
	}

}
