package com.hibernate.day2;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //this annotation reperesents your pojo class or bean class , this will avoid creating the mapping, this will map this entity with relational model
@Table(name="Staff") //table name if you specify the table then use

public class StaffPojoClass {
	
	

	@Id // is for primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //for generating the values
	private int eid;
	
	@Column(name="name")  //for mapping the columns
	private String name;
	
	@Column(name="designation")    
	private String designation;
	
	public StaffPojoClass() {
		// TODO Auto-generated constructor stub
	}

	public StaffPojoClass(int eid, String name, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "StaffPojoClass [eid=" + eid + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
}
