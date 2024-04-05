package CollectionsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ManageEmployee {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee(102, "Sanjay", "Khanna");
		Employee emp2 = new Employee(101, "Lokesh", "Karthick");
		Employee emp3 = new Employee(103, "Abikesh", "Kumar");
		Employee emp4 = new Employee(104, "Jeeva", "Sekar");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println("Before Sorting : ");
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList, new SortByEmpId());
		System.out.println("Sorting using empId : ");
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList, new SortByFirstName());
		System.out.println("Sorting using First Name : ");
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList, new SortByLastName());
		System.out.println("Sorting using Last Name : ");
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	
		
	}

}
