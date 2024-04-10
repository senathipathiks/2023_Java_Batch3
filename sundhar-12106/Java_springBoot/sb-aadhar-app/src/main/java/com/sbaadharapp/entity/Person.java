package com.sbaadharapp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String education;
	private String gender;
	@OneToOne(cascade = CascadeType.ALL)
	private Aadhar aadhar;

	public Person() {

	}

	public Person(int id, String name, String education, String gender, Aadhar aadhar) {
		super();
		this.id = id;
		this.name = name;
		this.education = education;
		this.gender = gender;
		this.aadhar = aadhar;
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

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", education=" + education + ", gender=" + gender + ", aadhar="
				+ aadhar + "]";
	}

}
