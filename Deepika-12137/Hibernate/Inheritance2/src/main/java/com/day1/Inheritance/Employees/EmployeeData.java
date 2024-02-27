package com.day1.Inheritance.Employees;

import javax.persistence.*;


@Entity
@Table(name="EmpData2")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)



public class EmployeeData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
