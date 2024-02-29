package Mapinjection;

import java.util.Iterator;
import java.util.Map;

public class Employee {

	private int employeeId;
	private String employeeName;
	private Map<Integer,String> employeeAddress;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, Map<Integer, String> employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
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

	public Map<Integer, String> getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Map<Integer, String> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	public void Display() {
		System.out.print("employeeId=" + employeeId +"\n"+ "employeeName=" + employeeName +"\n"+"employeeAddress=");
		Iterator <Integer> it = employeeAddress.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
		int key=it.next();  
		System.out.println("Door No.: "+key+"     Street: "+employeeAddress.get(key));  
		}  
	}
		
	
	
}

