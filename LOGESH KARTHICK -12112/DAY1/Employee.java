package DAY1;

public class Employee {
	private int EmpID;
	private String dept;
	private String gender;
	private String Empname;
	
	public Employee(int empID, String dept, String gender, String empname)
	{
		EmpID = empID;
		this.dept = dept;
		this.gender = gender;
		Empname = empname;
	}
	void displayEmployee()
	{
		System.out.println("Employee id" + EmpID);
		System.out.println("Employee dept" + dept);
		System.out.println("Employee gender" + gender);
		System.out.println("Employee name" + Empname);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(432, "manager", "male", "naan");
		e1.displayEmployee();
}

}
