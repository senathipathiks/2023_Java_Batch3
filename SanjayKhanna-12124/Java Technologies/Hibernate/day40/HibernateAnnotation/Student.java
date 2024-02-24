package com.sms.mavan.HibernateAnnotation;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stuId")
	private int stuId;
	@Column(name = "stuName")
	private String stuName;
	@Column(name = "city")
	private String city;
	
	

	
	public Student() {
		super();
	}

	public Student(int stuId, String stuName, String city) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", city=" + city + "]";
	}
	
	

}
