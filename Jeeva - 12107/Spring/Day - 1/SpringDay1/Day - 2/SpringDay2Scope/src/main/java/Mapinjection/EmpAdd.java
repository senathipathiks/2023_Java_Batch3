package Mapinjection;

import java.util.Iterator;
import java.util.Map;

public class EmpAdd {

	private int employeeId;
	private String employeeName;
	private Map<DoorNo,Address> employeeAddress;
	
	

	public EmpAdd() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}




	public String getEmployeeName() {
		return employeeName;
	}




	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}




	public Map<DoorNo, Address> getEmployeeAddress() {
		return employeeAddress;
	}




	public void setEmployeeAddress(Map<DoorNo, Address> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}




	public void Display() {
		System.out.print("employeeId=" + employeeId +"\n"+ "employeeName=" + employeeName +"\n"+"employeeAddress=");
		Iterator<DoorNo> it = employeeAddress.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
		DoorNo key=it.next();  
		System.out.println("Address : "+key+employeeAddress.get(key));  
		}  
	}
		
	
	

}
