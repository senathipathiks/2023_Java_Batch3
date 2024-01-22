package Day_1;

public class Employee {
	int empId;
	String empName,position,address;
	long phnNo;
	char gender;
	
	public Employee(int empId, String empName, String position, String address, long phnNo, char gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.position = position;
		this.address = address;
		this.phnNo = phnNo;
		this.gender = gender;
	}
	
	void displayEmpl() {
		System.out.println("Emp Id is: "+empId);
		System.out.println("Emp name is: "+empName);
		System.out.println("Dept is: "+position);
		System.out.println("Address is: "+address);
		System.out.println("Contact: "+phnNo);
		System.out.println("Emp gender is: "+gender);
		System.out.println("*******************");
	}

	
	
	public static void main(String[] args) {
		Employee e1=new Employee(12106,"Kaviya","Developer","Chennai",8912485717l,'F');
		Employee e2=new Employee(12113,"Srinivasan","Developer","Chennai",9489274502l,'M');
		Employee e3=new Employee(12115,"Hemachandran","Testing","Chennai",7890123449l,'M');
		
		e1.displayEmpl();
		e2.displayEmpl();
		e3.displayEmpl();
	}
	
	
}
