package com.employee;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Employee>{
	
	

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
