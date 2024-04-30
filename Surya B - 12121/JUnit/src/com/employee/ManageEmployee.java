package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(101, "Prem", "kumar");
		Employee e2 = new Employee(101, "Hemachandran", "Gnanvel");
		Employee e3 = new Employee(101, "Abishek", "S B");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		SortByFirstName name = new SortByFirstName();
		Collections.sort(empList, name);
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
	}
	
}
