package com.relationship.day1.EmployeeProject;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee102")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Employee1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int id, String name) {
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

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
