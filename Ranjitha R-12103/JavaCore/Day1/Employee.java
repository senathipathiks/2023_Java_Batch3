package Day1;

public class Employee {
	private int empID;
	private String empName;
	private String dept;
	private String gender;

	Employee(int empID, String empName, String dept, String gender) {
		this.empID = empID;
		this.empName = empName;
		this.dept = dept;
		this.gender = gender;
	}

	void displayEmployee() {
		System.out.println("Employee Id" + empID);
		System.out.println("Employee Name" + empName);
		System.out.println("Employee department" + dept);
		System.out.println("Gender" + gender);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Ranjitha", "Software engineer", "Female");
		e1.displayEmployee();
	}
}
