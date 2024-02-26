package com.sample.bean;

import javax.persistence.*;

@Entity
@Table
public class Student {
	
	@Id
	private int stuId;
	private String stuName;
	
	@ManyToOne(targetEntity = Department.class,cascade = CascadeType.ALL)
	@JoinColumn
	private Department d;

	public Student() {
	}

	public Student(int stuId, String stuName, Department d) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.d = d;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}
	
}
