package oops;

public class Employee {
	
	private String empName;
	private int empId;
	private int empSalary;
	private String empRole;
	
	Employee(String empName,int empId,int empSalary,String empRole){
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
		this.empRole=empRole;
	}
	
	void displayEmployee(){
	   System.out.println(empName);
	   System.out.println(empId);
	   System.out.println(empSalary);
	   System.out.println(empRole);
	   
	}
public static void main(String e[]) {
	Employee e1=new Employee("Deepika",123,500000,"Developer");
	Employee e2=new Employee("Sathiyan",124,600000," Fullstack Developer");
	Employee e3=new Employee("Rajesh",125,1000000,"Behavioral Trainer");
	e1.displayEmployee();
	e2.displayEmployee();
	e3.displayEmployee();

}
}
