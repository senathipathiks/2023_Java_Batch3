package com.emp.bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
 
@Entity
@Table(name="dept_tbl")
public class Department {
	
	
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL) //mapedBy to the field name in the Employee entity
	private List<Employee> employee;
	
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
 
	public String getDescription() {
		return description;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
 
}
