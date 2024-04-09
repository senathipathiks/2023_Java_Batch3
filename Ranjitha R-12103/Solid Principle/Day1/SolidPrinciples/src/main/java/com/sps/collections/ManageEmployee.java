package com.sps.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageEmployee {

	public static void main(String[] args) {
		// list is a interface
		// array list is a implementation
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(106, "Ram", "Kumar");
		Employee e2 = new Employee(102, "Arun", "Kumar");
		Employee e3 = new Employee(103, "Ranjitha", "Rajaram");
		Employee e4 = new Employee(104, "sowmiya", "Ramu");

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		//Collections.sort(empList,new SortByEmpID());
		//Collections.sort(empList,new SortByFirstname());
		Collections.sort(empList,new SortByLastName());
		
		for (Employee e : empList) {
			System.out.println(e);
		}

	}
}
