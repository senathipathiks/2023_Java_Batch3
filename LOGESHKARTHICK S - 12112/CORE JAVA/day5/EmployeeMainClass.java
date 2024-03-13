package core.day5;

class Employee{
	private int empNo;
	private String empName;
	
	void getData(int no,String name)
	{
		empNo=no;
		empName=name;
	}
	void display()
	{
		System.out.println("Employee number :" + empNo);
		System.out.println("employee name :"+ empName);
	}
}

public class EmployeeMainClass {

	public static void main(String[] args) {
		

	}

}
