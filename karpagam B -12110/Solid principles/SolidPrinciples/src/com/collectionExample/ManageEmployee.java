package com.collectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageEmployee {
	
	public static void main(String[] args) {
		
		//compare the ascii value and return accordingly
		String a="sparta";
		String b="sqarta"; // return -1,same means return 0
		
		int val=a.compareTo(b);
		System.out.println(val);
	}
		
		
		
//		List<Employee> empList=new ArrayList<Employee>();
//		
//		
//		Employee e1=new Employee(105,"kaviya","Anand");
//		Employee e2=new Employee(104,"sri","subu");
//		Employee e3=new Employee(103,"aadhav","pappu");
//		
//		empList.add(e1);
//		empList.add(e2);
//		empList.add(e3);
//		
//		//collection.sort didn't work here because it is a object(pojo class)
//		
//		//so we use implement method in another class with comparator
//		Collections.sort(empList,new SortByEmpId());
//		Collections.sort(empList,new SortByFirstName());
//		
//		//directly declared in  that
////		Collections.sort(empList,(o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
//
//		
//		
//		
//		
//		for (Employee employee : empList) {
//			    System.out.println(employee);
//		}
//		
//	}

}
