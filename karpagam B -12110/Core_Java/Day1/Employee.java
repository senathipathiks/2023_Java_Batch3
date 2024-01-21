package Com.Day1;

public class Employee {
	private int empId;
	private String empName;
	private int empAge;
	private int empSalary;
	private String empQualification;
	private String empLocation;
	Employee(){
		
	}
	Employee(int empId,String empName,int empAge,int empSalary,String empQualification, String empLocation){
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
		
		this.empSalary=empSalary;
		this.empQualification=empQualification;
		this.empLocation=empLocation;
	}
	void displayEmployeedetails() {
		System.out.println("Employee Id is:" +empId);
		System.out.println("Employee Name is:" +empName);
		System.out.println("Employee Age is:" +empAge);
		System.out.println("Employee Salary is:" +empSalary);
		System.out.println("Employee Qualification is:" +empQualification);
		System.out.println("Employee Location is:" +empLocation);

	}
	

	public static void main(String[] args) {
		Employee obj1=new Employee(123,"Raj",23,20000,"BE","Tenkasi");
		obj1.displayEmployeedetails();

	}

}
