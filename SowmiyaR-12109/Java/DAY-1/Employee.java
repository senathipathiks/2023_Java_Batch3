package Day1;

public class Employee {
	private int EmpID;
	private String EmpName;
	private String Empposition;
	private String EmpAddress;
	private double Empsal;
	Employee(int EmpID,String EmpName,String Empposition,String EmpAddress,double Empsal){
		this.EmpID=EmpID;
		this.EmpName=EmpName;
		this.Empposition=Empposition;
		this.EmpAddress=EmpAddress;
		this.Empsal=Empsal;
	}
	void displayEmployee() {
		System.out.println("Employee ID:"+EmpID);
		System.out.println("Employee Name:"+EmpName);
		System.out.println("Employee Domain:"+Empposition);
		System.out.println("Employee Address:"+EmpAddress);
		System.out.println("Employee Salary:"+Empsal);
		
	}

	public static void main(String[] args) {
		Employee s1=new Employee(1,"sowmi","developer","Trichy",100);
		s1.displayEmployee();
		

	}

}
