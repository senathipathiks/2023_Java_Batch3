package com.solidprinciples.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee e1 = new Employee(103, "chandru", "kanth");
		Employee e2 = new Employee(102, "Srinivasan", "s");
		Employee e3 = new Employee(101, "Vinolisha", "vijayakumar");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
//		Collections.sort(empList, (o1, o2) -> ( o1.getFirstName().compareToIgnoreCase(o2.getFirstName()) ));
//		Collections.sort(empList, (o1, o2) -> ( o1.getLastName().compareToIgnoreCase(o2.getLastName()) ));
		Collections.sort(empList, (o1, o2) -> ( o1.getEmpId()-o2.getEmpId() ));
		
		
		for (Employee e : empList) {
			System.out.println(e);
			
		}
	}

}
