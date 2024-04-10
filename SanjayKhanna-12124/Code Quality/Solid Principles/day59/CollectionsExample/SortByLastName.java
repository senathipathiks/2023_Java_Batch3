package CollectionsExample;

import java.util.Comparator;

public class SortByLastName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
}
