package com.cqp.collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ManageEmployee {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		
		Employee e1= new Employee(104,"Sherin","Dhanya");
		Employee e2= new Employee(100,"Jerin","Rejho");
		Employee e3= new Employee(14,"Carolin","Premila");
		Employee e4= new Employee(13,"David","Dehal");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Collections.sort(empList, new SortByFirstName());
		
		for(Employee e: empList) {
			
			System.out.println(e);
		}
	}
}
