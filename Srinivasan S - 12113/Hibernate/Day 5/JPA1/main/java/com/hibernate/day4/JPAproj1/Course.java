package com.hibernate.day4.JPAproj1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
class Course {
	@Id
	private int cId;
	private String cName;
	private String dept;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cId, String cName, String dept) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.dept = dept;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
