package com.collectionExample;

import java.util.Comparator;

//compare and sort the list, we use comparator
public class SortByEmpId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//105-103 (Swap it)
		return o1.getEmpid()-o2.getEmpid();
	}
	
	

}
