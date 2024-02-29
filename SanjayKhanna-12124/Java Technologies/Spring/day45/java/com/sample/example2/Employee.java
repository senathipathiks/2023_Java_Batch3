package com.sample.example2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sample.example1.Address;

public class Employee {
	
	private int epmId;
	private String empName;
	private Map<Integer, String> dept;
	public Employee() {
		super();
	}
	public Employee(int epmId, String empName, Map<Integer, String> dept) {
		this.epmId = epmId;
		this.empName = empName;
		this.dept = dept;
	}
	public int getEpmId() {
		return epmId;
	}
	public void setEpmId(int epmId) {
		this.epmId = epmId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Map<Integer, String> getDept() {
		return dept;
	}
	public void setDept(Map<Integer, String> dept) {
		this.dept = dept;
	}
	public void display() {
		System.out.println("Employee ID : "+epmId+"\nEmployee Name : "+empName);
		Set<Entry<Integer, String>> set = dept.entrySet();
		Iterator<Entry<Integer,String>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e = it.next();
			if(e.getKey()==epmId)
				System.out.println("Department : "+e.getValue());
		}
	}
}
