package collectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageEmployee
{
	public static void main(String[] args) 
	{
		List<Employee> empList= new ArrayList<Employee>();
		
		Employee e1=new Employee(103, "Varshinee", "Manisekar");
		Employee e2=new Employee(101, "Sowmiya", "Ramu");
		Employee e3=new Employee(100, "Ranjitha", "Rajaram");
		Employee e4=new Employee(104, "Karpagam", "Srini");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		//Collections.sort(empList,new SortByEmpID());
        //Collections.sort(empList,new SortByFirstName());
		Collections.sort(empList,new SortByLastName());
		
		for(Employee e:empList) {
			System.out.println(e);
		}
	}

}
