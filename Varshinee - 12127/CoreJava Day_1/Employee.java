package Day_1;

public class Employee {
	private int EmployeeId;
	private String EmpName;
	private String ProjectName;
	private String Position;
	private String Gender;
	
	Employee(int EmployeeId,String EmpName,String ProjectName,String Position,String Gender){
		this.EmployeeId=EmployeeId;
		this.EmpName=EmpName;
		this.ProjectName=ProjectName;
		this.Position=Position;
		this.Gender=Gender;
		}
	
	void DisplayEmployee() {
		System.out.println("EmployeeId: "+EmployeeId);
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Project Name: "+ProjectName);
		System.out.println("Postion: "+Position);
		System.out.println("Gender: "+Gender);
	}

	public static void main(String[] args) {
		Employee E1=new Employee(1,"Varshi","Java","Trainee","Female");
		E1.DisplayEmployee();

	}

}
