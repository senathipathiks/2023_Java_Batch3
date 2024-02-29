package Mapinjection;

public class DoorNo {

	private int employeeDoorNo;

	
	
	
	public DoorNo() {
		super();
	}

	public DoorNo(int employeeDoorNo) {
		super();
		this.employeeDoorNo = employeeDoorNo;
	}

	public int getEmployeeDoorNo() {
		return employeeDoorNo;
	}

	public void setEmployeeDoorNo(int employeeDoorNo) {
		this.employeeDoorNo = employeeDoorNo;
	}

	@Override
	public String toString() {
		return "DoorNo [employeeDoorNo=" + employeeDoorNo + "]";
	}
	
	
	
}
