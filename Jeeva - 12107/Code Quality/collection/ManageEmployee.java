package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManageEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList =new ArrayList<Employee>();
		
		Employee e1=new Employee(300, "lokesh", "karthik");
		
		Employee e2=new Employee(200, "jeeva", "sekar");
		
		Employee e3=new Employee(100, "abishek", "kumar");
		
		Employee e4=new Employee(400, "vidamuyarchi", "vicky");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Collections.sort(empList,new  SortByLastName());
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		
	}
}
