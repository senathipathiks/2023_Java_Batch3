package CoreTopic;

public class Employee {
	
	private int empID;
    private String empName;
    private String role;
    private String gender;
	public Employee(int empID, String empName, String role, String gender) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.role = role;
		this.gender = gender;
	}
	
	void displayEmployee()
    {
        System.out.println("Employee ID is " + empID);
        System.out.println("Employee name is " + empName);
        System.out.println("Emp role is " + role );
        System.out.println("Emp 's gender is " + gender);
    }
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		Employee obj = new Employee(123, "vignesh", "software trainee", "Male");
        obj.displayEmployee();
    }

}
