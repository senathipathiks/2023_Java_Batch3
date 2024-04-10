package com.code.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ManageEmployee {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		Employee e3 = new Employee(101, "Sundar", "Raj");
		Employee e1 = new Employee(102, "Srini", "vasan");
		Employee e2 = new Employee(103, "Kaviya", "Srinivasan");

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

//		List<Employee> sortedList = empList.stream().sorted().collect(Collectors.toList());
//		
//		sortedList.forEach(System.out::println);

		// we can compare list of data with collection sort class which having the
		// conditions to compare and sort the emp id
		Collections.sort(empList, new CollectionSort());

		// we can compare list of data with java 8 features
		// Collections.sort(empList, (o1, o2) ->
		// o1.getFirstName().compareTo(o2.getFirstName()));

		for (Employee e : empList) {
			System.out.println(e);

		}

	}

}
