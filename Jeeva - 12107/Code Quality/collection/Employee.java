package collection;

public class Employee {

	
	private int empid;
	
	private String firstName;
	
	private String lasttName;

	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int empid, String firstName, String lasttName) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lasttName = lasttName;
	}




	public int getEmpid() {
		return empid;
	}




	public void setEmpid(int empid) {
		this.empid = empid;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLasttName() {
		return lasttName;
	}




	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}




	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lasttName=" + lasttName + "]";
	}
	
	
	
}
