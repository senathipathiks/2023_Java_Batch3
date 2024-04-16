package com.code.collectionexample;

import java.util.Comparator;

public class CollectionSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpId()-o2.getEmpId();
//		return o1.getFirstName().compareTo(o2.getFirstName());

	}
	
	
	

}
